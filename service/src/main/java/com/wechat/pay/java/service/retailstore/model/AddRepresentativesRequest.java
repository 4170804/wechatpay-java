// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销加价购对外API
//
// 指定服务商可通过该接口报名加价购活动、查询某个区域内的加价购活动列表、锁定加价活动购资格以及解锁加价购活动资格。
//
// API version: 1.3.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.retailstore.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/** AddRepresentativesRequest */
public class AddRepresentativesRequest {
  /** 业务代理信息列表 说明：业务代理信息列表 */
  @SerializedName("representative_info_list")
  private List<RepresentativeInfo> representativeInfoList = new ArrayList<RepresentativeInfo>();
  /** 请求业务单据号 说明：商户新增业务代理请求的唯一标识，商户需保证唯一。可包含英文字母，数字，\\|，\\_，\\*，\\-等内容，不允许出现其他不合法符号。 */
  @SerializedName("out_request_no")
  private String outRequestNo;
  /** 添加时间 说明：添加时间 */
  @SerializedName("add_time")
  private String addTime;

  public List<RepresentativeInfo> getRepresentativeInfoList() {
    return representativeInfoList;
  }

  public void setRepresentativeInfoList(List<RepresentativeInfo> representativeInfoList) {
    this.representativeInfoList = representativeInfoList;
  }

  public String getOutRequestNo() {
    return outRequestNo;
  }

  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }

  public String getAddTime() {
    return addTime;
  }

  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRepresentativesRequest {\n");
    sb.append("    representativeInfoList: ")
        .append(toIndentedString(representativeInfoList))
        .append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
