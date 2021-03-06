// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface ConceptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.Concept)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The concept's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The concept's unique id.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name of the concept in the given language.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the concept in the given language.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Used to indicate presence (1.0) or not (0.0) of this concept when making a request.
   * This is also the prediction probability when returning predictions from our API.
   * For convenience we use the default of 1.0 when making requests so the concept you provide is
   * is treated as a positive (1.0) and not a negative (which would be value == 0.0).
   * </pre>
   *
   * <code>float value = 3 [(.clarifai.api.utils.cl_show_if_empty) = true, (.clarifai.api.utils.cl_default_float) = 1];</code>
   * @return The value.
   */
  float getValue();

  /**
   * <pre>
   * When the concept was created. The format is https://www.ietf.org/rfc/rfc3339.txt .
   * Example: "2006-01-02T15:04:05.999999Z". This field is used only in a response.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 4;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * When the concept was created. The format is https://www.ietf.org/rfc/rfc3339.txt .
   * Example: "2006-01-02T15:04:05.999999Z". This field is used only in a response.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 4;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * When the concept was created. The format is https://www.ietf.org/rfc/rfc3339.txt .
   * Example: "2006-01-02T15:04:05.999999Z". This field is used only in a response.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * The language in which the concept name is in. This is *ONLY* used in the response and setting
   * it in a request is ignored since the default language of your app is used when creating
   * or patching a Concept. To set other languages for your concept use the ConceptLanguage object
   * and its corresponding endpoints.
   * </pre>
   *
   * <code>string language = 5;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * The language in which the concept name is in. This is *ONLY* used in the response and setting
   * it in a request is ignored since the default language of your app is used when creating
   * or patching a Concept. To set other languages for your concept use the ConceptLanguage object
   * and its corresponding endpoints.
   * </pre>
   *
   * <code>string language = 5;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * The application id that this concept is within. This can be ignored by most users.
   * </pre>
   *
   * <code>string app_id = 6;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The application id that this concept is within. This can be ignored by most users.
   * </pre>
   *
   * <code>string app_id = 6;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * The definition for the concept. Similar to name. This can be ignored by most users.
   * </pre>
   *
   * <code>string definition = 7;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   * The definition for the concept. Similar to name. This can be ignored by most users.
   * </pre>
   *
   * <code>string definition = 7;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <pre>
   * The vocabulary that this concept belongs to. This is useful if you have different unique sets
   * of concepts that you can separate out based on this field. For example "age_appearance" vs
   * "gender_appearance" in a list of concept returned from the demographics model.
   * </pre>
   *
   * <code>string vocab_id = 8;</code>
   * @return The vocabId.
   */
  java.lang.String getVocabId();
  /**
   * <pre>
   * The vocabulary that this concept belongs to. This is useful if you have different unique sets
   * of concepts that you can separate out based on this field. For example "age_appearance" vs
   * "gender_appearance" in a list of concept returned from the demographics model.
   * </pre>
   *
   * <code>string vocab_id = 8;</code>
   * @return The bytes for vocabId.
   */
  com.google.protobuf.ByteString
      getVocabIdBytes();
}
