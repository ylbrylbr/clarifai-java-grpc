// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AppDuplicationFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AppDuplicationFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Copy only inputs and default annotations
   * </pre>
   *
   * <code>bool copy_inputs = 1;</code>
   * @return The copyInputs.
   */
  boolean getCopyInputs();

  /**
   * <pre>
   * Copy only concepts
   * </pre>
   *
   * <code>bool copy_concepts = 2;</code>
   * @return The copyConcepts.
   */
  boolean getCopyConcepts();

  /**
   * <pre>
   * Copy annotations and what it depends on: inputs and concepts
   * </pre>
   *
   * <code>bool copy_annotations = 3;</code>
   * @return The copyAnnotations.
   */
  boolean getCopyAnnotations();

  /**
   * <pre>
   * Copy models and what it depends on: concepts
   * </pre>
   *
   * <code>bool copy_models = 4;</code>
   * @return The copyModels.
   */
  boolean getCopyModels();

  /**
   * <pre>
   * Copy workflows and what it depends on: models and concepts
   * </pre>
   *
   * <code>bool copy_workflows = 5;</code>
   * @return The copyWorkflows.
   */
  boolean getCopyWorkflows();
}