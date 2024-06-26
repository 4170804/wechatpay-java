// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微工卡接口文档
//
// 服务商通过本API文档提供的接口，查询商户和微工卡的授权关系、生成预授权的token口令、核身预下单、核身结果的查询等。
//
// API version: 1.5.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payrollcard.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** PreOrderAuthenticationRequest */
public class PreOrderAuthenticationRequest {
  /** 用户OpenID 说明：用户OpenID */
  @SerializedName("openid")
  private String openid;

  /** 服务商AppID 说明：当输入服务商AppID时，会校验其与服务商商户号的绑定关系。服务商AppID和与特约商户AppID至少输入一个，且必须要有拉起微工卡小程序时使用的AppID。 */
  @SerializedName("appid")
  private String appid;

  /** 特约商户号 说明：特约商户号 */
  @SerializedName("sub_mchid")
  private String subMchid;

  /**
   * 特约商户AppID 说明：当输入特约商户AppID时，会校验其与特约商户号的绑定关系。服务商AppID和与特约商户AppID至少输入一个，且必须要有拉起微工卡小程序时使用的AppID。
   */
  @SerializedName("sub_appid")
  private String subAppid;

  /** 商家核身单号 说明：商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 */
  @SerializedName("authenticate_number")
  private String authenticateNumber;

  /** 项目名称 说明：该劳务活动的项目名称 */
  @SerializedName("project_name")
  private String projectName;

  /** 用工单位名称 说明：该工人所属的用工企业 */
  @SerializedName("employer_name")
  private String employerName;

  /** 核身类型 说明：核身类型 */
  @SerializedName("authenticate_type")
  private AuthenticationType authenticateType;

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

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getSubAppid() {
    return subAppid;
  }

  public void setSubAppid(String subAppid) {
    this.subAppid = subAppid;
  }

  public String getAuthenticateNumber() {
    return authenticateNumber;
  }

  public void setAuthenticateNumber(String authenticateNumber) {
    this.authenticateNumber = authenticateNumber;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  public AuthenticationType getAuthenticateType() {
    return authenticateType;
  }

  public void setAuthenticateType(AuthenticationType authenticateType) {
    this.authenticateType = authenticateType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreOrderAuthenticationRequest {\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    subAppid: ").append(toIndentedString(subAppid)).append("\n");
    sb.append("    authenticateNumber: ").append(toIndentedString(authenticateNumber)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    authenticateType: ").append(toIndentedString(authenticateType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
