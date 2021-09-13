package org.tikv;

import org.tikv.common.PDClient;
import org.tikv.common.TiConfiguration;
import org.tikv.common.TiSession;
import org.tikv.common.util.BackOffer;
import org.tikv.common.util.ConcreteBackOffer;
import org.tikv.kvproto.Metapb;

import java.util.List;

public class RegionTest {
    public static void main(String[] args){

        TiConfiguration conf = TiConfiguration.createRawDefault("10.81.116.78:8000");
        conf.setDBPrefix("test");
        TiSession session = TiSession.create(conf);

        PDClient pdClient = session.getPDClient();

        BackOffer bo = ConcreteBackOffer.newCustomBackOff(BackOffer.PD_INFO_BACKOFF);
        List<Metapb.Store> stores = pdClient.getAllStores(bo);
        for(Metapb.Store store : stores){
            System.out.println(store);
        }
    }
}
