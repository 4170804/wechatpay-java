// Copyright 2021 Tencent Inc. All rights reserved.
//
// 获取账单文件下载地址的对外API
//
// 为方便商户快速查询和核对账务信息，支持通过本接口获取离线账单的下载地址。
//
// API version: 2.1.4

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.billdownload.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** GetTradeBillRequest */
public class GetTradeBillRequest {
  /** 账单日期 说明：账单日期，格式yyyy-MM-DD，仅支持三个月内的账单下载申请。 */
  @SerializedName("bill_date")
  @Expose(serialize = false)
  private String billDate;

  /** 子商户号 说明：若商户是直连商户： * 无需填写该字段 若商户是服务商： * 不填则默认返回服务商下的交易或退款数据 * 如需下载某个子商户下的交易或退款数据，则该字段必填 */
  @SerializedName("sub_mchid")
  @Expose(serialize = false)
  private String subMchid;

  /** 账单类型 说明：账单类型，不填则默认是ALL */
  @SerializedName("bill_type")
  @Expose(serialize = false)
  private BillType billType;

  /** 压缩类型 说明：压缩类型，不填则以不压缩的方式返回数据流 */
  @SerializedName("tar_type")
  @Expose(serialize = false)
  private TarType tarType;

  public String getBillDate() {
    return billDate;
  }

  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public BillType getBillType() {
    return billType;
  }

  public void setBillType(BillType billType) {
    this.billType = billType;
  }

  public TarType getTarType() {
    return tarType;
  }

  public void setTarType(TarType tarType) {
    this.tarType = tarType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTradeBillRequest {\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
    sb.append("    tarType: ").append(toIndentedString(tarType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
