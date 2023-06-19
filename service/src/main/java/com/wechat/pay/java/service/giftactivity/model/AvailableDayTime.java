// Copyright 2021 Tencent Inc. All rights reserved.
//
// 支付有礼活动对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.1.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.giftactivity.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** AvailableDayTime */
public class AvailableDayTime {
  /** 每日可用开始时间 说明：每日可用开始时间(格式:110000,表示11:00:00) */
  @SerializedName("begin_day_time")
  private String beginDayTime;
  /** 每日可用结束时间 说明：每日可用结束时间 (格式:135959,表示13:59:59) */
  @SerializedName("end_day_time")
  private String endDayTime;

  public String getBeginDayTime() {
    return beginDayTime;
  }

  public void setBeginDayTime(String beginDayTime) {
    this.beginDayTime = beginDayTime;
  }

  public String getEndDayTime() {
    return endDayTime;
  }

  public void setEndDayTime(String endDayTime) {
    this.endDayTime = endDayTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDayTime {\n");
    sb.append("    beginDayTime: ").append(toIndentedString(beginDayTime)).append("\n");
    sb.append("    endDayTime: ").append(toIndentedString(endDayTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
