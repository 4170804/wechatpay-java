// Copyright 2021 Tencent Inc. All rights reserved.
//
// JSAPI支付
//
// JSAPI支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.partnerpayments.jsapi.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** Payer */
public class Payer {
  /** 用户标识 说明：用户在服务商AppID下的唯一标识。 */
  @SerializedName("sp_openid")
  private String spOpenid;

  /** 用户子标识 说明：用户在子商户AppID下的唯一标识。 */
  @SerializedName("sub_openid")
  private String subOpenid;

  public String getSpOpenid() {
    return spOpenid;
  }

  public void setSpOpenid(String spOpenid) {
    this.spOpenid = spOpenid;
  }

  public String getSubOpenid() {
    return subOpenid;
  }

  public void setSubOpenid(String subOpenid) {
    this.subOpenid = subOpenid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payer {\n");
    sb.append("    spOpenid: ").append(toIndentedString(spOpenid)).append("\n");
    sb.append("    subOpenid: ").append(toIndentedString(subOpenid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
