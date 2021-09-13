// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rustproto.proto

package rustproto;

public final class Rustproto {
  private Rustproto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(rustproto.Rustproto.exposeOneofAll);
    registry.add(rustproto.Rustproto.exposeFieldsAll);
    registry.add(rustproto.Rustproto.generateAccessorsAll);
    registry.add(rustproto.Rustproto.carllercheBytesForBytesAll);
    registry.add(rustproto.Rustproto.carllercheBytesForStringAll);
    registry.add(rustproto.Rustproto.liteRuntimeAll);
    registry.add(rustproto.Rustproto.exposeOneof);
    registry.add(rustproto.Rustproto.exposeFields);
    registry.add(rustproto.Rustproto.generateAccessors);
    registry.add(rustproto.Rustproto.carllercheBytesForBytes);
    registry.add(rustproto.Rustproto.carllercheBytesForString);
    registry.add(rustproto.Rustproto.exposeFieldsField);
    registry.add(rustproto.Rustproto.generateAccessorsField);
    registry.add(rustproto.Rustproto.carllercheBytesForBytesField);
    registry.add(rustproto.Rustproto.carllercheBytesForStringField);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int EXPOSE_ONEOF_ALL_FIELD_NUMBER = 17001;
  /**
   * <pre>
   * When true, oneof field is generated public
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> exposeOneofAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int EXPOSE_FIELDS_ALL_FIELD_NUMBER = 17003;
  /**
   * <pre>
   * When true all fields are public, and not accessors generated
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> exposeFieldsAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int GENERATE_ACCESSORS_ALL_FIELD_NUMBER = 17004;
  /**
   * <pre>
   * When false, `get_`, `set_`, `mut_` etc. accessors are not generated
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> generateAccessorsAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_BYTES_ALL_FIELD_NUMBER = 17011;
  /**
   * <pre>
   * Use `bytes::Bytes` for `bytes` fields
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> carllercheBytesForBytesAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_STRING_ALL_FIELD_NUMBER = 17012;
  /**
   * <pre>
   * Use `bytes::Bytes` for `string` fields
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> carllercheBytesForStringAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int LITE_RUNTIME_ALL_FIELD_NUMBER = 17035;
  /**
   * <pre>
   * When true, will only generate codes that works with lite runtime.
   * </pre>
   *
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      java.lang.Boolean> liteRuntimeAll = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int EXPOSE_ONEOF_FIELD_NUMBER = 17001;
  /**
   * <pre>
   * When true, oneof field is generated public
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> exposeOneof = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int EXPOSE_FIELDS_FIELD_NUMBER = 17003;
  /**
   * <pre>
   * When true all fields are public, and not accessors generated
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> exposeFields = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int GENERATE_ACCESSORS_FIELD_NUMBER = 17004;
  /**
   * <pre>
   * When false, `get_`, `set_`, `mut_` etc. accessors are not generated
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> generateAccessors = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_BYTES_FIELD_NUMBER = 17011;
  /**
   * <pre>
   * Use `bytes::Bytes` for `bytes` fields
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> carllercheBytesForBytes = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_STRING_FIELD_NUMBER = 17012;
  /**
   * <pre>
   * Use `bytes::Bytes` for `string` fields
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> carllercheBytesForString = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int EXPOSE_FIELDS_FIELD_FIELD_NUMBER = 17003;
  /**
   * <pre>
   * When true all fields are public, and not accessors generated
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> exposeFieldsField = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int GENERATE_ACCESSORS_FIELD_FIELD_NUMBER = 17004;
  /**
   * <pre>
   * When false, `get_`, `set_`, `mut_` etc. accessors are not generated
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> generateAccessorsField = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_BYTES_FIELD_FIELD_NUMBER = 17011;
  /**
   * <pre>
   * Use `bytes::Bytes` for `bytes` fields
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> carllercheBytesForBytesField = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int CARLLERCHE_BYTES_FOR_STRING_FIELD_FIELD_NUMBER = 17012;
  /**
   * <pre>
   * Use `bytes::Bytes` for `string` fields
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> carllercheBytesForStringField = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017rustproto.proto\022\trustproto\032 google/pro" +
      "tobuf/descriptor.proto:8\n\020expose_oneof_a" +
      "ll\022\034.google.protobuf.FileOptions\030\351\204\001 \001(\010" +
      ":9\n\021expose_fields_all\022\034.google.protobuf." +
      "FileOptions\030\353\204\001 \001(\010:>\n\026generate_accessor" +
      "s_all\022\034.google.protobuf.FileOptions\030\354\204\001 " +
      "\001(\010:F\n\036carllerche_bytes_for_bytes_all\022\034." +
      "google.protobuf.FileOptions\030\363\204\001 \001(\010:G\n\037c" +
      "arllerche_bytes_for_string_all\022\034.google." +
      "protobuf.FileOptions\030\364\204\001 \001(\010:8\n\020lite_run" +
      "time_all\022\034.google.protobuf.FileOptions\030\213" +
      "\205\001 \001(\010:7\n\014expose_oneof\022\037.google.protobuf" +
      ".MessageOptions\030\351\204\001 \001(\010:8\n\rexpose_fields" +
      "\022\037.google.protobuf.MessageOptions\030\353\204\001 \001(" +
      "\010:=\n\022generate_accessors\022\037.google.protobu" +
      "f.MessageOptions\030\354\204\001 \001(\010:E\n\032carllerche_b" +
      "ytes_for_bytes\022\037.google.protobuf.Message" +
      "Options\030\363\204\001 \001(\010:F\n\033carllerche_bytes_for_" +
      "string\022\037.google.protobuf.MessageOptions\030" +
      "\364\204\001 \001(\010:<\n\023expose_fields_field\022\035.google." +
      "protobuf.FieldOptions\030\353\204\001 \001(\010:A\n\030generat" +
      "e_accessors_field\022\035.google.protobuf.Fiel" +
      "dOptions\030\354\204\001 \001(\010:I\n carllerche_bytes_for" +
      "_bytes_field\022\035.google.protobuf.FieldOpti" +
      "ons\030\363\204\001 \001(\010:J\n!carllerche_bytes_for_stri" +
      "ng_field\022\035.google.protobuf.FieldOptions\030" +
      "\364\204\001 \001(\010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    exposeOneofAll.internalInit(descriptor.getExtensions().get(0));
    exposeFieldsAll.internalInit(descriptor.getExtensions().get(1));
    generateAccessorsAll.internalInit(descriptor.getExtensions().get(2));
    carllercheBytesForBytesAll.internalInit(descriptor.getExtensions().get(3));
    carllercheBytesForStringAll.internalInit(descriptor.getExtensions().get(4));
    liteRuntimeAll.internalInit(descriptor.getExtensions().get(5));
    exposeOneof.internalInit(descriptor.getExtensions().get(6));
    exposeFields.internalInit(descriptor.getExtensions().get(7));
    generateAccessors.internalInit(descriptor.getExtensions().get(8));
    carllercheBytesForBytes.internalInit(descriptor.getExtensions().get(9));
    carllercheBytesForString.internalInit(descriptor.getExtensions().get(10));
    exposeFieldsField.internalInit(descriptor.getExtensions().get(11));
    generateAccessorsField.internalInit(descriptor.getExtensions().get(12));
    carllercheBytesForBytesField.internalInit(descriptor.getExtensions().get(13));
    carllercheBytesForStringField.internalInit(descriptor.getExtensions().get(14));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
