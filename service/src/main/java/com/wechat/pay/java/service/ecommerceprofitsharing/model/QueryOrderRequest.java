// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付电商平台分账API
//
// 微信支付电商平台分账API
//
// API version: 1.0.21

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommerceprofitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryOrderRequest */
public class QueryOrderRequest {
  /** 电商平台二级商户号 说明：分账出资的电商平台二级商户，填写微信支付分配的商户号 */
  @SerializedName("sub_mchid")
  @Expose(serialize = false)
  private String subMchid;

  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  @Expose(serialize = false)
  private String transactionId;

  /** 商户分账单号 说明：商户系统内部的分账单号，在商户系统内部唯一（单次分账、多次分账、完结分账应使用不同的商户分账单号），同一分账单号多次请求等同一次。只能是数字、大小写字母_-|*@ */
  @SerializedName("out_order_no")
  @Expose(serialize = false)
  private String outOrderNo;

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutOrderNo() {
    return outOrderNo;
  }

  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOrderRequest {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
