// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface WorkerPoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.WorkerPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the `WorkerPool`, with format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * The value of `{worker_pool}` is provided by `worker_pool_id` in
   * `CreateWorkerPool` request and the value of `{location}` is determined by
   * the endpoint accessed.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the `WorkerPool`, with format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * The value of `{worker_pool}` is provided by `worker_pool_id` in
   * `CreateWorkerPool` request and the value of `{location}` is determined by
   * the endpoint accessed.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A user-specified, human-readable name for the `WorkerPool`. If provided,
   * this value must be 1-63 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A user-specified, human-readable name for the `WorkerPool`. If provided,
   * this value must be 1-63 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. A unique identifier for the `WorkerPool`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. A unique identifier for the `WorkerPool`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * User specified annotations. See https://google.aip.dev/128#annotations
   * for more details such as format and size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * User specified annotations. See https://google.aip.dev/128#annotations
   * for more details such as format and size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * User specified annotations. See https://google.aip.dev/128#annotations
   * for more details such as format and size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * User specified annotations. See https://google.aip.dev/128#annotations
   * for more details such as format and size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */

  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * User specified annotations. See https://google.aip.dev/128#annotations
   * for more details such as format and size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4;</code>
   */

  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Time at which the request to create the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time at which the request to create the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time at which the request to create the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time at which the request to update the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Time at which the request to update the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Time at which the request to update the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time at which the request to delete the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * Output only. Time at which the request to delete the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * Output only. Time at which the request to delete the `WorkerPool` was
   * received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * Output only. `WorkerPool` state.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. `WorkerPool` state.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.WorkerPool.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloudbuild.v1.WorkerPool.State getState();

  /**
   * <pre>
   * Private Pool using a v1 configuration.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PrivatePoolV1Config private_pool_v1_config = 12;</code>
   * @return Whether the privatePoolV1Config field is set.
   */
  boolean hasPrivatePoolV1Config();
  /**
   * <pre>
   * Private Pool using a v1 configuration.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PrivatePoolV1Config private_pool_v1_config = 12;</code>
   * @return The privatePoolV1Config.
   */
  com.google.cloudbuild.v1.PrivatePoolV1Config getPrivatePoolV1Config();
  /**
   * <pre>
   * Private Pool using a v1 configuration.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PrivatePoolV1Config private_pool_v1_config = 12;</code>
   */
  com.google.cloudbuild.v1.PrivatePoolV1ConfigOrBuilder getPrivatePoolV1ConfigOrBuilder();

  /**
   * <pre>
   * Output only. Checksum computed by the server. May be sent on update and
   * delete requests to ensure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Output only. Checksum computed by the server. May be sent on update and
   * delete requests to ensure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  public com.google.cloudbuild.v1.WorkerPool.ConfigCase getConfigCase();
}