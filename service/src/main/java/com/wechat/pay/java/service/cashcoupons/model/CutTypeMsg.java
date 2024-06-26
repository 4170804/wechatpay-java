// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** CutTypeMsg */
public class CutTypeMsg {
  /** 可用优惠的商品最高单价 说明：可用优惠的商品最高单价，单位分 */
  @SerializedName("single_price_max")
  private Long singlePriceMax;

  /** 减至后的优惠单价 说明：减至后的优惠单价 */
  @SerializedName("cut_to_price")
  private Long cutToPrice;

  public Long getSinglePriceMax() {
    return singlePriceMax;
  }

  public void setSinglePriceMax(Long singlePriceMax) {
    this.singlePriceMax = singlePriceMax;
  }

  public Long getCutToPrice() {
    return cutToPrice;
  }

  public void setCutToPrice(Long cutToPrice) {
    this.cutToPrice = cutToPrice;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutTypeMsg {\n");
    sb.append("    singlePriceMax: ").append(toIndentedString(singlePriceMax)).append("\n");
    sb.append("    cutToPrice: ").append(toIndentedString(cutToPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
