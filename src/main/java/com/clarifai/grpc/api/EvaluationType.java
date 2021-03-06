// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

/**
 * Protobuf enum {@code clarifai.api.EvaluationType}
 */
public enum EvaluationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * default
   * </pre>
   *
   * <code>Classification = 0;</code>
   */
  Classification(0),
  /**
   * <code>Detection = 1;</code>
   */
  Detection(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * default
   * </pre>
   *
   * <code>Classification = 0;</code>
   */
  public static final int Classification_VALUE = 0;
  /**
   * <code>Detection = 1;</code>
   */
  public static final int Detection_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EvaluationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EvaluationType forNumber(int value) {
    switch (value) {
      case 0: return Classification;
      case 1: return Detection;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EvaluationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EvaluationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EvaluationType>() {
          public EvaluationType findValueByNumber(int number) {
            return EvaluationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.api.Resources.getDescriptor().getEnumTypes().get(3);
  }

  private static final EvaluationType[] VALUES = values();

  public static EvaluationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EvaluationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.api.EvaluationType)
}

