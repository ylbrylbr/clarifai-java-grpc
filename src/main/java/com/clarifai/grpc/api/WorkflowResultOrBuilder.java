// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface WorkflowResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.WorkflowResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.clarifai.api.status.Status status = 2;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <code>.clarifai.api.status.Status status = 2;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the object was created. We follow the XXXX timestamp
   * format. We use https://www.ietf.org/rfc/rfc3339.txt format:
   * "2006-01-02T15:04:05.999999Z" so you can expect results like
   * the following from the API:
   * "2017-04-11T21:50:50.223962Z"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.clarifai.api.Model model = 4;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.clarifai.api.Model model = 4;</code>
   * @return The model.
   */
  com.clarifai.grpc.api.Model getModel();
  /**
   * <code>.clarifai.api.Model model = 4;</code>
   */
  com.clarifai.grpc.api.ModelOrBuilder getModelOrBuilder();

  /**
   * <code>.clarifai.api.Input input = 5;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <code>.clarifai.api.Input input = 5;</code>
   * @return The input.
   */
  com.clarifai.grpc.api.Input getInput();
  /**
   * <code>.clarifai.api.Input input = 5;</code>
   */
  com.clarifai.grpc.api.InputOrBuilder getInputOrBuilder();

  /**
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  java.util.List<com.clarifai.grpc.api.Output> 
      getOutputsList();
  /**
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  com.clarifai.grpc.api.Output getOutputs(int index);
  /**
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  int getOutputsCount();
  /**
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.OutputOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <code>repeated .clarifai.api.Output outputs = 6;</code>
   */
  com.clarifai.grpc.api.OutputOrBuilder getOutputsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicate if the output of this model is suppressed.
   * </pre>
   *
   * <code>bool suppress_output = 7;</code>
   * @return The suppressOutput.
   */
  boolean getSuppressOutput();
}
