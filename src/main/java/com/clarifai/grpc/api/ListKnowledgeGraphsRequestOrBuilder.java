// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface ListKnowledgeGraphsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.ListKnowledgeGraphsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user_id and app_id information.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return Whether the userAppId field is set.
   */
  boolean hasUserAppId();
  /**
   * <pre>
   * The user_id and app_id information.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   * @return The userAppId.
   */
  com.clarifai.grpc.api.UserAppIDSet getUserAppId();
  /**
   * <pre>
   * The user_id and app_id information.
   * </pre>
   *
   * <code>.clarifai.api.UserAppIDSet user_app_id = 1;</code>
   */
  com.clarifai.grpc.api.UserAppIDSetOrBuilder getUserAppIdOrBuilder();
}