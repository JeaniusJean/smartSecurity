// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartCameras.proto

package grpc.smartcameras;

public final class SmartCamerasImpl {
  private SmartCamerasImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_videoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_videoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_videoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_videoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022smartCameras.proto\"\033\n\013ringRequest\022\014\n\004r" +
      "ing\030\001 \001(\t\"\037\n\014ringResponse\022\017\n\007respond\030\001 \001" +
      "(\t\"\035\n\014videoRequest\022\r\n\005video\030\001 \001(\t\"#\n\rvid" +
      "eoResponse\022\022\n\nwatchVideo\030\001 \001(\t2q\n\014smartC" +
      "ameras\0222\n\rsmartDoorbell\022\014.ringRequest\032\r." +
      "ringResponse\"\000(\0010\001\022-\n\010IPCamera\022\r.videoRe" +
      "quest\032\016.videoResponse\"\0000\001B\'\n\021grpc.smartc" +
      "amerasB\020SmartCamerasImplP\001b\006proto3"
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
        }, assigner);
    internal_static_ringRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ringRequest_descriptor,
        new java.lang.String[] { "Ring", });
    internal_static_ringResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ringResponse_descriptor,
        new java.lang.String[] { "Respond", });
    internal_static_videoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_videoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_videoRequest_descriptor,
        new java.lang.String[] { "Video", });
    internal_static_videoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_videoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_videoResponse_descriptor,
        new java.lang.String[] { "WatchVideo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}