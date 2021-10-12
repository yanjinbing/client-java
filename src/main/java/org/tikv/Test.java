package org.tikv;

import com.google.protobuf.ByteString;
import org.tikv.common.TiConfiguration;
import org.tikv.common.TiSession;
import org.tikv.kvproto.Kvrpcpb;
import org.tikv.raw.RawKVClient;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static void test1WR() throws Exception {

        TiConfiguration conf = TiConfiguration.createRawDefault("172.20.94.33:80");
        TiSession session = TiSession.create(conf);
        RawKVClient client = session.createRawClient();

        for(int i = 1; i< 10; i++){
            ByteString key = ByteString.copyFromUtf8(String.format("t10_r%010d", i));
            ByteString value = ByteString.copyFromUtf8(String.format("V-%d", i));
            client.put(key, value);
        }
        for(int i = 1; i< 10; i++){
            ByteString key = ByteString.copyFromUtf8(String.format("t10_r%010d", i));
            Optional<ByteString> value = client.get(key);
            if ( value.isPresent() )
                System.out.println(value.get().toStringUtf8());

        }

        client.close();
        session.close();
    }

    public static void test2R() throws Exception {

        TiConfiguration conf = TiConfiguration.createRawDefault("172.20.94.33:80");
        conf.setTimeout(5000);
        conf.setDBPrefix("test3");
        TiSession session = TiSession.create(conf);
        RawKVClient client = session.createRawClient();

        List<Kvrpcpb.KvPair> list = client.scanPrefix(ByteString.copyFromUtf8("k"));
        for(Kvrpcpb.KvPair pair : list) {
            System.out.println(pair);
        }
        Optional<ByteString> result = client.get(ByteString.copyFromUtf8("k1"));
        System.out.println(result.get().toString());
        client.close();
        session.close();
    }

    public static void batchTest(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("url thread_number total_number batch_count prefix startid");
            return;
        }
        String url = args[0];
        int threads = Integer.parseInt(args[1]);
        int total = Integer.parseInt(args[2]);
        int batches = Integer.parseInt(args[3]);
        String prefix = args.length > 4 ? args[4] : "";
        int startId = args.length > 5 ? Integer.parseInt(args[5]) : 0;

        System.out.println(String.format("%s, %d, %d, %d, %s, %d", url, threads, total, batches, prefix, startId));
        TiConfiguration conf = TiConfiguration.createRawDefault(url);
        conf.setBatchPutConcurrency(500);

        TiSession session = TiSession.create(conf);

        RawKVClient client = session.createRawClient();
        Random random = new Random(System.currentTimeMillis());

        long start = System.currentTimeMillis();
        final long[] start2 = {System.currentTimeMillis()};
        AtomicLong counter = new AtomicLong(0);
        AtomicLong _id = new AtomicLong(0);
        _id.set(startId);


        ExecutorService executor = Executors.newFixedThreadPool(threads);
        for (int t = 0; t < threads; t++) {
            executor.execute(() -> {
                for (int i = 0; i < total; i++) {
                    Map<ByteString, ByteString> kvPairs = new HashMap<>();
                    for (int j = 0; j < batches; j++) {
                        ByteString key = ByteString.copyFromUtf8(String.format("t10_r%d%s%010d", Thread.currentThread().getId(), prefix, _id.incrementAndGet()));
                        //ByteString key = ByteString.copyFromUtf8(String.format("t10_r%010d", _id.incrementAndGet()));
                        ByteString value = ByteString.copyFromUtf8(String.format("%010d", random.nextInt()));
                        kvPairs.put(key, value);
                    }
                    //client.batchPutAtomic(kvPairs);
                    client.batchPut(kvPairs);
                    long c = counter.incrementAndGet();
                    if ( c % 100 == 0 ){
                        System.out.println(String.format("%d %.0f, %.0f",
                                _id.get() - startId,
                                (double) c * batches / (System.currentTimeMillis() - start) * 1000,
                                (double)batches * 100 /(System.currentTimeMillis() - start2[0]) * 1000));
                        start2[0] = System.currentTimeMillis();
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        System.out.println(String.format("%d %.0f", _id.get(), (double)_id.get() / (System.currentTimeMillis() - start) * 1000));

        client.close();
        session.close();

    }
    public static void main(String[] args) throws Exception {
     //   batchTest(args);
        test1WR();
    }
}
