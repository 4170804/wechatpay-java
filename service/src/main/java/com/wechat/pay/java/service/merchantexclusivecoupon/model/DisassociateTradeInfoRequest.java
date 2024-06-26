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

/** DisassociateTradeInfoRequest */
public class DisassociateTradeInfoRequest {
  /** 批次号 说明：微信为每个商家券批次分配的唯一ID， 对于商户自定义code的批次，关联请求必须填写批次号 */
  @SerializedName("stock_id")
  private String stockId;

  /** 券code 说明：券的唯一标识 */
  @SerializedName("coupon_code")
  private String couponCode;

  /** 取消关联的商户订单号 说明：欲取消与商家券关联的微信支付下单的商户订单号，该单号需要已操作过与券关联，否则无法取消关联 */
  @SerializedName("out_trade_no")
  private String outTradeNo;

  /** 请求业务单据号 说明：商户创建批次凭据号（格式：商户ID+日期+流水号），商户侧需保持唯一性，可包含英文字母，数字，｜，_，*，-等内容，不允许出现其他不合法符号。 */
  @SerializedName("out_request_no")
  private String outRequestNo;

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getOutRequestNo() {
    return outRequestNo;
  }

  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateTradeInfoRequest {\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
