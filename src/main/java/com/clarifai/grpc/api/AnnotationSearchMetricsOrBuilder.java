// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface AnnotationSearchMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.AnnotationSearchMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ground truth we are evaluating against
   * </pre>
   *
   * <code>.clarifai.api.Search ground_truth = 1;</code>
   * @return Whether the groundTruth field is set.
   */
  boolean hasGroundTruth();
  /**
   * <pre>
   * The ground truth we are evaluating against
   * </pre>
   *
   * <code>.clarifai.api.Search ground_truth = 1;</code>
   * @return The groundTruth.
   */
  com.clarifai.grpc.api.Search getGroundTruth();
  /**
   * <pre>
   * The ground truth we are evaluating against
   * </pre>
   *
   * <code>.clarifai.api.Search ground_truth = 1;</code>
   */
  com.clarifai.grpc.api.SearchOrBuilder getGroundTruthOrBuilder();

  /**
   * <pre>
   * The set we are evaluating
   * </pre>
   *
   * <code>.clarifai.api.Search search_to_eval = 2;</code>
   * @return Whether the searchToEval field is set.
   */
  boolean hasSearchToEval();
  /**
   * <pre>
   * The set we are evaluating
   * </pre>
   *
   * <code>.clarifai.api.Search search_to_eval = 2;</code>
   * @return The searchToEval.
   */
  com.clarifai.grpc.api.Search getSearchToEval();
  /**
   * <pre>
   * The set we are evaluating
   * </pre>
   *
   * <code>.clarifai.api.Search search_to_eval = 2;</code>
   */
  com.clarifai.grpc.api.SearchOrBuilder getSearchToEvalOrBuilder();

  /**
   * <pre>
   * The metric result
   * </pre>
   *
   * <code>.clarifai.api.EvalMetrics metrics = 3;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <pre>
   * The metric result
   * </pre>
   *
   * <code>.clarifai.api.EvalMetrics metrics = 3;</code>
   * @return The metrics.
   */
  com.clarifai.grpc.api.EvalMetrics getMetrics();
  /**
   * <pre>
   * The metric result
   * </pre>
   *
   * <code>.clarifai.api.EvalMetrics metrics = 3;</code>
   */
  com.clarifai.grpc.api.EvalMetricsOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * data is filled out with the concepts used for this evaluation
   * </pre>
   *
   * <code>.clarifai.api.Data data = 4;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * data is filled out with the concepts used for this evaluation
   * </pre>
   *
   * <code>.clarifai.api.Data data = 4;</code>
   * @return The data.
   */
  com.clarifai.grpc.api.Data getData();
  /**
   * <pre>
   * data is filled out with the concepts used for this evaluation
   * </pre>
   *
   * <code>.clarifai.api.Data data = 4;</code>
   */
  com.clarifai.grpc.api.DataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * active_concept_count is the number of concepts for this evaluation
   * </pre>
   *
   * <code>uint32 active_concept_count = 5;</code>
   * @return The activeConceptCount.
   */
  int getActiveConceptCount();
}
