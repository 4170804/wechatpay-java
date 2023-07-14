// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付分账API
//
// 微信支付分账API
//
// API version: 0.0.9

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.profitsharing.model;

import com.google.gson.annotations.SerializedName;

/** DetailFailReason */
public enum DetailFailReason {
  @SerializedName("ACCOUNT_ABNORMAL")
  ACCOUNT_ABNORMAL,

  @SerializedName("NO_RELATION")
  NO_RELATION,

  @SerializedName("RECEIVER_HIGH_RISK")
  RECEIVER_HIGH_RISK,

  @SerializedName("RECEIVER_REAL_NAME_NOT_VERIFIED")
  RECEIVER_REAL_NAME_NOT_VERIFIED,

  @SerializedName("NO_AUTH")
  NO_AUTH,

  @SerializedName("RECEIVER_RECEIPT_LIMIT")
  RECEIVER_RECEIPT_LIMIT,

  @SerializedName("PAYER_ACCOUNT_ABNORMAL")
  PAYER_ACCOUNT_ABNORMAL,

  @SerializedName("INVALID_REQUEST")
  INVALID_REQUEST
}