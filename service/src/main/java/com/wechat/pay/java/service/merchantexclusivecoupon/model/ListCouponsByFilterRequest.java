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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** ListCouponsByFilterRequest */
public class ListCouponsByFilterRequest {
  /**
   * 用户标识 说明：Openid信息，用户在AppID下的唯一标识。
   * 校验规则：传入的OpenID得是调用方商户号（即请求头里面的商户号）有绑定关系的AppID获取的OpenID或传入的OpenID得是归属商户号有绑定关系的AppID获取的OpenID。[获取OpenID文档](https://pay.weixin.qq.com/wiki/doc/apiv3/terms_definition/chapter1_1_3.shtml#part-3)
   */
  @SerializedName("openid")
  @Expose(serialize = false)
  private String openid;

  /**
   * 公众账号ID 说明：支持传入与当前调用接口商户号有绑定关系的AppID。支持小程序AppID与公众号AppID。
   * 校验规则：传入的AppID得是与调用方商户号（即请求头里面的商户号）有绑定关系的AppID 或 传入的AppID得是归属商户号有绑定关系的AppID
   */
  @SerializedName("appid")
  @Expose(serialize = false)
  private String appid;

  /** 批次号 说明：批次号，是否指定批次号查询 */
  @SerializedName("stock_id")
  @Expose(serialize = false)
  private String stockId;

  /** 创建批次的商户号 说明：批次创建方商户号 校验规则：当调用方商户号（即请求头中的商户号）为创建批次方商户号时，该参数必传 */
  @SerializedName("creator_merchant")
  @Expose(serialize = false)
  private String creatorMerchant;

  /** 批次归属商户号 说明：批次归属商户号 校验规则：当调用方商户号（即请求头中的商户号）为批次归属商户号时，该参数必传 */
  @SerializedName("belong_merchant")
  @Expose(serialize = false)
  private String belongMerchant;

  /** 批次发放商户号 说明：批次发放商户号 校验规则：当调用方商户号（即请求头中的商户号）为批次发放商户号时，该参数必传；委托营销关系下，请填写委托发券的商户号 */
  @SerializedName("sender_merchant")
  @Expose(serialize = false)
  private String senderMerchant;

  /** 分页页码 说明：分页页码 */
  @SerializedName("offset")
  @Expose(serialize = false)
  private Integer offset;

  /** 分页大小 说明：分页大小 */
  @SerializedName("limit")
  @Expose(serialize = false)
  private Integer limit;

  /** 券状态 说明：商家券状态 */
  @SerializedName("coupon_state")
  @Expose(serialize = false)
  private CouponStatus couponState;

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getCreatorMerchant() {
    return creatorMerchant;
  }

  public void setCreatorMerchant(String creatorMerchant) {
    this.creatorMerchant = creatorMerchant;
  }

  public String getBelongMerchant() {
    return belongMerchant;
  }

  public void setBelongMerchant(String belongMerchant) {
    this.belongMerchant = belongMerchant;
  }

  public String getSenderMerchant() {
    return senderMerchant;
  }

  public void setSenderMerchant(String senderMerchant) {
    this.senderMerchant = senderMerchant;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CouponStatus getCouponState() {
    return couponState;
  }

  public void setCouponState(CouponStatus couponState) {
    this.couponState = couponState;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCouponsByFilterRequest {\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    creatorMerchant: ").append(toIndentedString(creatorMerchant)).append("\n");
    sb.append("    belongMerchant: ").append(toIndentedString(belongMerchant)).append("\n");
    sb.append("    senderMerchant: ").append(toIndentedString(senderMerchant)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    couponState: ").append(toIndentedString(couponState)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
