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

public interface UpdateExclusionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.UpdateExclusionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the exclusion to update:
   *
   *     "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/exclusions/my-exclusion"`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the exclusion to update:
   *
   *     "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/exclusions/my-exclusion"`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. New values for the existing exclusion. Only the fields specified
   * in `update_mask` are relevant.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the exclusion field is set.
   */
  boolean hasExclusion();
  /**
   *
   *
   * <pre>
   * Required. New values for the existing exclusion. Only the fields specified
   * in `update_mask` are relevant.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The exclusion.
   */
  com.google.logging.v2.LogExclusion getExclusion();
  /**
   *
   *
   * <pre>
   * Required. New values for the existing exclusion. Only the fields specified
   * in `update_mask` are relevant.
   * </pre>
   *
   * <code>.google.logging.v2.LogExclusion exclusion = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.logging.v2.LogExclusionOrBuilder getExclusionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A non-empty list of fields to change in the existing exclusion.
   * New values for the fields are taken from the corresponding fields in the
   * [LogExclusion][google.logging.v2.LogExclusion] included in this request.
   * Fields not mentioned in `update_mask` are not changed and are ignored in
   * the request.
   *
   * For example, to change the filter and description of an exclusion,
   * specify an `update_mask` of `"filter,description"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A non-empty list of fields to change in the existing exclusion.
   * New values for the fields are taken from the corresponding fields in the
   * [LogExclusion][google.logging.v2.LogExclusion] included in this request.
   * Fields not mentioned in `update_mask` are not changed and are ignored in
   * the request.
   *
   * For example, to change the filter and description of an exclusion,
   * specify an `update_mask` of `"filter,description"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A non-empty list of fields to change in the existing exclusion.
   * New values for the fields are taken from the corresponding fields in the
   * [LogExclusion][google.logging.v2.LogExclusion] included in this request.
   * Fields not mentioned in `update_mask` are not changed and are ignored in
   * the request.
   *
   * For example, to change the filter and description of an exclusion,
   * specify an `update_mask` of `"filter,description"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
