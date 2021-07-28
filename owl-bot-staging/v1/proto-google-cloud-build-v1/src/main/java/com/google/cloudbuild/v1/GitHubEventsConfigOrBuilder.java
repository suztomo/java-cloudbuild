// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface GitHubEventsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.GitHubEventsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The installationID that emits the GitHub event.
   * </pre>
   *
   * <code>int64 installation_id = 1 [deprecated = true];</code>
   * @return The installationId.
   */
  @java.lang.Deprecated long getInstallationId();

  /**
   * <pre>
   * Owner of the repository. For example: The owner for
   * https://github.com/googlecloudplatform/cloud-builders is
   * "googlecloudplatform".
   * </pre>
   *
   * <code>string owner = 6;</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * Owner of the repository. For example: The owner for
   * https://github.com/googlecloudplatform/cloud-builders is
   * "googlecloudplatform".
   * </pre>
   *
   * <code>string owner = 6;</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * Name of the repository. For example: The name for
   * https://github.com/googlecloudplatform/cloud-builders is "cloud-builders".
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the repository. For example: The name for
   * https://github.com/googlecloudplatform/cloud-builders is "cloud-builders".
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * filter to match changes in pull requests.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter pull_request = 4;</code>
   * @return Whether the pullRequest field is set.
   */
  boolean hasPullRequest();
  /**
   * <pre>
   * filter to match changes in pull requests.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter pull_request = 4;</code>
   * @return The pullRequest.
   */
  com.google.cloudbuild.v1.PullRequestFilter getPullRequest();
  /**
   * <pre>
   * filter to match changes in pull requests.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PullRequestFilter pull_request = 4;</code>
   */
  com.google.cloudbuild.v1.PullRequestFilterOrBuilder getPullRequestOrBuilder();

  /**
   * <pre>
   * filter to match changes in refs like branches, tags.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PushFilter push = 5;</code>
   * @return Whether the push field is set.
   */
  boolean hasPush();
  /**
   * <pre>
   * filter to match changes in refs like branches, tags.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PushFilter push = 5;</code>
   * @return The push.
   */
  com.google.cloudbuild.v1.PushFilter getPush();
  /**
   * <pre>
   * filter to match changes in refs like branches, tags.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.PushFilter push = 5;</code>
   */
  com.google.cloudbuild.v1.PushFilterOrBuilder getPushOrBuilder();

  public com.google.cloudbuild.v1.GitHubEventsConfig.EventCase getEventCase();
}