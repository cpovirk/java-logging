/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

// Protobuf Java Version: 3.25.5
package com.google.logging.v2;

public interface LinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.Link)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the link. The name can have up to 100 characters.
   * A valid link id (at the end of the link name) must only have alphanumeric
   * characters and underscores within it.
   *
   *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *
   * For example:
   *
   *   `projects/my-project/locations/global/buckets/my-bucket/links/my_link
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the link. The name can have up to 100 characters.
   * A valid link id (at the end of the link name) must only have alphanumeric
   * characters and underscores within it.
   *
   *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *     "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/links/[LINK_ID]"
   *
   * For example:
   *
   *   `projects/my-project/locations/global/buckets/my-bucket/links/my_link
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Describes this link.
   *
   * The maximum length of the description is 8000 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Describes this link.
   *
   * The maximum length of the description is 8000 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the link.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the link.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the link.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource lifecycle state.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LifecycleState lifecycle_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lifecycleState.
   */
  int getLifecycleStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The resource lifecycle state.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LifecycleState lifecycle_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lifecycleState.
   */
  com.google.logging.v2.LifecycleState getLifecycleState();

  /**
   *
   *
   * <pre>
   * The information of a BigQuery Dataset. When a link is created, a BigQuery
   * dataset is created along with it, in the same project as the LogBucket it's
   * linked to. This dataset will also have BigQuery Views corresponding to the
   * LogViews in the bucket.
   * </pre>
   *
   * <code>.google.logging.v2.BigQueryDataset bigquery_dataset = 5;</code>
   *
   * @return Whether the bigqueryDataset field is set.
   */
  boolean hasBigqueryDataset();
  /**
   *
   *
   * <pre>
   * The information of a BigQuery Dataset. When a link is created, a BigQuery
   * dataset is created along with it, in the same project as the LogBucket it's
   * linked to. This dataset will also have BigQuery Views corresponding to the
   * LogViews in the bucket.
   * </pre>
   *
   * <code>.google.logging.v2.BigQueryDataset bigquery_dataset = 5;</code>
   *
   * @return The bigqueryDataset.
   */
  com.google.logging.v2.BigQueryDataset getBigqueryDataset();
  /**
   *
   *
   * <pre>
   * The information of a BigQuery Dataset. When a link is created, a BigQuery
   * dataset is created along with it, in the same project as the LogBucket it's
   * linked to. This dataset will also have BigQuery Views corresponding to the
   * LogViews in the bucket.
   * </pre>
   *
   * <code>.google.logging.v2.BigQueryDataset bigquery_dataset = 5;</code>
   */
  com.google.logging.v2.BigQueryDatasetOrBuilder getBigqueryDatasetOrBuilder();
}
