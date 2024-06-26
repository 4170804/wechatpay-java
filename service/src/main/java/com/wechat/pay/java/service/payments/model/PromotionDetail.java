// Copyright 2021 Tencent Inc. All rights reserved.

// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payments.model;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.util.GsonUtil;
import java.util.List;

/** PromotionDetail */
public class PromotionDetail {
  /** 券ID 说明：券ID */
  @SerializedName("coupon_id")
  private String couponId;

  /** 优惠名称 说明：优惠名称 */
  @SerializedName("name")
  private String name;

  /** GLOBAL：全场代金券；SINGLE：单品优惠 */
  public enum ScopeEnum {
    @SerializedName("GLOBAL")
    GLOBAL,

    @SerializedName("SINGLE")
    SINGLE
  }

  @SerializedName("scope")
  private ScopeEnum scope;

  /** CASH：充值；NOCASH：预充值。 */
  public enum TypeEnum {
    @SerializedName("CASH")
    CASH,

    @SerializedName("NOCASH")
    NOCASH
  }

  @SerializedName("type")
  private TypeEnum type;

  /** 优惠券面额 说明：优惠券面额 */
  @SerializedName("amount")
  private Integer amount;

  /** 活动ID 说明：活动ID，批次ID */
  @SerializedName("stock_id")
  private String stockId;

  /** 微信出资 说明：单位为分 */
  @SerializedName("wechatpay_contribute")
  private Integer wechatpayContribute;

  /** 商户出资 说明：单位为分 */
  @SerializedName("merchant_contribute")
  private Integer merchantContribute;

  /** 其他出资 说明：单位为分 */
  @SerializedName("other_contribute")
  private Integer otherContribute;

  /** 优惠币种 说明：CNY：人民币，境内商户号仅支持人民币。 */
  @SerializedName("currency")
  private String currency;

  /** 单品列表 */
  @SerializedName("goods_detail")
  private List<PromotionGoodsDetail> goodsDetail;

  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public Integer getWechatpayContribute() {
    return wechatpayContribute;
  }

  public void setWechatpayContribute(Integer wechatpayContribute) {
    this.wechatpayContribute = wechatpayContribute;
  }

  public Integer getMerchantContribute() {
    return merchantContribute;
  }

  public void setMerchantContribute(Integer merchantContribute) {
    this.merchantContribute = merchantContribute;
  }

  public Integer getOtherContribute() {
    return otherContribute;
  }

  public void setOtherContribute(Integer otherContribute) {
    this.otherContribute = otherContribute;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public List<PromotionGoodsDetail> getGoodsDetail() {
    return goodsDetail;
  }

  public void setGoodsDetail(List<PromotionGoodsDetail> goodsDetail) {
    this.goodsDetail = goodsDetail;
  }

  @Override
  public String toString() {
    return GsonUtil.getGson().toJson(this);
  }
}
