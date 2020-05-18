// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/service.proto

package com.clarifai.grpc.api;

public interface MultiConceptRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.MultiConceptRelationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   * @return The status.
   */
  com.clarifai.grpc.api.status.Status getStatus();
  /**
   * <pre>
   * The response status.
   * </pre>
   *
   * <code>.clarifai.api.status.Status status = 1;</code>
   */
  com.clarifai.grpc.api.status.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<com.clarifai.grpc.api.ConceptRelation> 
      getConceptRelationsList();
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.ConceptRelation getConceptRelations(int index);
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  int getConceptRelationsCount();
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  java.util.List<? extends com.clarifai.grpc.api.ConceptRelationOrBuilder> 
      getConceptRelationsOrBuilderList();
  /**
   * <pre>
   * The returned concept relations.
   * </pre>
   *
   * <code>repeated .clarifai.api.ConceptRelation concept_relations = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  com.clarifai.grpc.api.ConceptRelationOrBuilder getConceptRelationsOrBuilder(
      int index);
}