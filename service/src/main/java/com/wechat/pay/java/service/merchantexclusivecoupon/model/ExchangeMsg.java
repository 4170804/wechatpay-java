// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** ExchangeMsg */
public class ExchangeMsg {
  /** 单品换购价 说明：单品换购价，单位：分。 特殊规则：取值范围 0 ≤ value ≤ 10000000 */
  @SerializedName("exchange_price")
  private Long exchangePrice;

  /** 消费门槛 说明：消费门槛，单位：分。 特殊规则：取值范围 1 ≤ value ≤ 10000000 */
  @SerializedName("transaction_minimum")
  private Long transactionMinimum;

  public Long getExchangePrice() {
    return exchangePrice;
  }

  public void setExchangePrice(Long exchangePrice) {
    this.exchangePrice = exchangePrice;
  }

  public Long getTransactionMinimum() {
    return transactionMinimum;
  }

  public void setTransactionMinimum(Long transactionMinimum) {
    this.transactionMinimum = transactionMinimum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeMsg {\n");
    sb.append("    exchangePrice: ").append(toIndentedString(exchangePrice)).append("\n");
    sb.append("    transactionMinimum: ").append(toIndentedString(transactionMinimum)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
