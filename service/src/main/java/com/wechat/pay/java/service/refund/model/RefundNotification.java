package com.wechat.pay.java.service.refund.model;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.util.GsonUtil;
import java.util.ArrayList;
import java.util.List;

/** RefundNotification */
public class RefundNotification {

  /** 微信支付退款号 说明：微信支付退款号 */
  @SerializedName("refund_id")
  private String refundId;

  /** 商户退款单号 说明：商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。 */
  @SerializedName("out_refund_no")
  private String outRefundNo;

  /** 微信支付订单号 说明：微信支付交易订单号 */
  @SerializedName("transaction_id")
  private String transactionId;

  /** 商户订单号 说明：原支付交易对应的商户订单号 */
  @SerializedName("out_trade_no")
  private String outTradeNo;

  /**
   * 退款入账账户 说明：取当前退款单的退款入账方，有以下几种情况： 1）退回银行卡：{银行名称}{卡类型}{卡尾号} 2）退回支付用户零钱:支付用户零钱
   * 3）退还商户:商户基本账户商户结算银行账户 4）退回支付用户零钱通:支付用户零钱通
   */
  @SerializedName("user_received_account")
  private String userReceivedAccount;

  /**
   * 退款成功时间
   * 说明：退款成功时间，退款状态status为SUCCESS（退款成功）时，返回该字段。遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日13点29分35秒。
   */
  @SerializedName("success_time")
  private String successTime;

  /**
   * 退款创建时间
   * 说明：退款受理时间，遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日13点29分35秒。
   */
  @SerializedName("create_time")
  private String createTime;

  /** 优惠退款信息 说明：优惠退款信息 */
  @SerializedName("promotion_detail")
  private List<Promotion> promotionDetail = new ArrayList<Promotion>();

  /** 金额信息 说明：金额详细信息 */
  @SerializedName("amount")
  private Amount amount;

  /**
   * 退款渠道 说明：枚举值： - ORIGINAL—原路退款 - BALANCE—退回到余额 - OTHER_BALANCE—原账户异常退到其他余额账户 -
   * OTHER_BANKCARD—原银行卡异常退到其他银行卡
   */
  @SerializedName("channel")
  private Channel channel;

  /**
   * 资金账户 说明：退款所使用资金对应的资金账户类型 枚举值： - UNSETTLED : 未结算资金 - AVAILABLE : 可用余额 - UNAVAILABLE : 不可用余额 -
   * OPERATION : 运营户 - BASIC : 基本账户（含可用余额和不可用余额）
   */
  @SerializedName("funds_account")
  private FundsAccount fundsAccount;

  /**
   * 退款状态 说明：退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，可前往商户平台（pay.weixin.qq.com）-交易中心，手动处理此笔退款。 枚举值： -
   * SUCCESS—退款成功 - CLOSED—退款关闭 - PROCESSING—退款处理中 - ABNORMAL—退款异常
   */
  @SerializedName("refund_status")
  private Status refundStatus;

  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public String getOutRefundNo() {
    return outRefundNo;
  }

  public void setOutRefundNo(String outRefundNo) {
    this.outRefundNo = outRefundNo;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getUserReceivedAccount() {
    return userReceivedAccount;
  }

  public void setUserReceivedAccount(String userReceivedAccount) {
    this.userReceivedAccount = userReceivedAccount;
  }

  public String getSuccessTime() {
    return successTime;
  }

  public void setSuccessTime(String successTime) {
    this.successTime = successTime;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public List<Promotion> getPromotionDetail() {
    return promotionDetail;
  }

  public void setPromotionDetail(List<Promotion> promotionDetail) {
    this.promotionDetail = promotionDetail;
  }

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public FundsAccount getFundsAccount() {
    return fundsAccount;
  }

  public void setFundsAccount(FundsAccount fundsAccount) {
    this.fundsAccount = fundsAccount;
  }

  @Override
  public String toString() {
    return GsonUtil.getGson().toJson(this);
  }

  public Status getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(Status refundStatus) {
    this.refundStatus = refundStatus;
  }
}
