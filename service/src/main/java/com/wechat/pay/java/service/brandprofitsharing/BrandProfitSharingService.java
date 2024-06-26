// Copyright 2021 Tencent Inc. All rights reserved.
//
// 连锁加盟供应链分账API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 1.0.12

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.brandprofitsharing;

import static com.wechat.pay.java.core.http.UrlEncoder.urlEncode;
import static com.wechat.pay.java.core.util.GsonUtil.toJson;
import static java.util.Objects.requireNonNull;

import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.core.cipher.PrivacyEncryptor;
import com.wechat.pay.java.core.exception.HttpException;
import com.wechat.pay.java.core.exception.MalformedMessageException;
import com.wechat.pay.java.core.exception.ServiceException;
import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.http.Constant;
import com.wechat.pay.java.core.http.DefaultHttpClientBuilder;
import com.wechat.pay.java.core.http.HostName;
import com.wechat.pay.java.core.http.HttpClient;
import com.wechat.pay.java.core.http.HttpHeaders;
import com.wechat.pay.java.core.http.HttpMethod;
import com.wechat.pay.java.core.http.HttpRequest;
import com.wechat.pay.java.core.http.HttpResponse;
import com.wechat.pay.java.core.http.JsonRequestBody;
import com.wechat.pay.java.core.http.MediaType;
import com.wechat.pay.java.core.http.QueryParameter;
import com.wechat.pay.java.core.http.RequestBody;
import com.wechat.pay.java.service.brandprofitsharing.model.AddReceiverRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.AddReceiverResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.CreateOrderRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.CreateOrderResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.CreateReturnOrderRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.CreateReturnOrderResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.DeleteReceiverRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.DeleteReceiverResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.FinishOrderRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.FinishOrderResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryBrandMerchantRatioRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryBrandMerchantRatioResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryOrderAmountRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryOrderAmountResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryOrderRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryOrderResponse;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryReturnOrderRequest;
import com.wechat.pay.java.service.brandprofitsharing.model.QueryReturnOrderResponse;

/** BrandProfitSharingService服务 */
public class BrandProfitSharingService {

  private final HttpClient httpClient;
  private final HostName hostName;
  private final PrivacyEncryptor encryptor;

  private BrandProfitSharingService(
      HttpClient httpClient, HostName hostName, PrivacyEncryptor encryptor) {
    this.httpClient = requireNonNull(httpClient);
    this.hostName = hostName;
    this.encryptor = requireNonNull(encryptor);
  }

  /** BrandProfitSharingService构造器 */
  public static class Builder {

    private HttpClient httpClient;
    private HostName hostName;
    private PrivacyEncryptor encryptor;

    public Builder config(Config config) {
      this.httpClient = new DefaultHttpClientBuilder().config(config).build();
      this.encryptor = config.createEncryptor();

      return this;
    }

    public Builder hostName(HostName hostName) {
      this.hostName = hostName;
      return this;
    }

    public Builder httpClient(HttpClient httpClient) {
      this.httpClient = httpClient;
      return this;
    }

    public Builder encryptor(PrivacyEncryptor encryptor) {
      this.encryptor = encryptor;
      return this;
    }

    public BrandProfitSharingService build() {
      return new BrandProfitSharingService(httpClient, hostName, encryptor);
    }
  }

  /**
   * 查询最大分账比例
   *
   * @param request 请求参数
   * @return QueryBrandMerchantRatioResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public QueryBrandMerchantRatioResponse queryBrandMerchantRatio(
      QueryBrandMerchantRatioRequest request) {
    String requestPath =
        "https://api.mch.weixin.qq.com/v3/brand/profitsharing/brand-configs/{brand_mchid}";

    QueryBrandMerchantRatioRequest realRequest = request;
    // 添加 path param
    requestPath =
        requestPath.replace("{" + "brand_mchid" + "}", urlEncode(realRequest.getBrandMchid()));

    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<QueryBrandMerchantRatioResponse> httpResponse =
        httpClient.execute(httpRequest, QueryBrandMerchantRatioResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 请求分账
   *
   * @param request 请求参数
   * @return CreateOrderResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public CreateOrderResponse createOrder(CreateOrderRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/orders";
    // 加密敏感信息
    CreateOrderRequest realRequest = request.cloneWithCipher(encryptor::encrypt);
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.WECHAT_PAY_SERIAL, encryptor.getWechatpaySerial());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<CreateOrderResponse> httpResponse =
        httpClient.execute(httpRequest, CreateOrderResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 完结分账
   *
   * @param request 请求参数
   * @return FinishOrderResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public FinishOrderResponse finishOrder(FinishOrderRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/finish-order";
    FinishOrderRequest realRequest = request;
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<FinishOrderResponse> httpResponse =
        httpClient.execute(httpRequest, FinishOrderResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 查询分账结果
   *
   * @param request 请求参数
   * @return QueryOrderResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public QueryOrderResponse queryOrder(QueryOrderRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/orders";

    QueryOrderRequest realRequest = request;
    // 添加 query param
    QueryParameter queryParameter = new QueryParameter();
    if (realRequest.getSubMchid() != null) {
      queryParameter.add("sub_mchid", urlEncode(realRequest.getSubMchid()));
    }
    if (realRequest.getTransactionId() != null) {
      queryParameter.add("transaction_id", urlEncode(realRequest.getTransactionId()));
    }
    if (realRequest.getOutOrderNo() != null) {
      queryParameter.add("out_order_no", urlEncode(realRequest.getOutOrderNo()));
    }
    requestPath += queryParameter.getQueryStr();
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<QueryOrderResponse> httpResponse =
        httpClient.execute(httpRequest, QueryOrderResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 查询订单剩余待分金额
   *
   * @param request 请求参数
   * @return QueryOrderAmountResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public QueryOrderAmountResponse queryOrderAmount(QueryOrderAmountRequest request) {
    String requestPath =
        "https://api.mch.weixin.qq.com/v3/brand/profitsharing/orders/{transaction_id}/amounts";

    QueryOrderAmountRequest realRequest = request;
    // 添加 path param
    requestPath =
        requestPath.replace(
            "{" + "transaction_id" + "}", urlEncode(realRequest.getTransactionId()));

    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<QueryOrderAmountResponse> httpResponse =
        httpClient.execute(httpRequest, QueryOrderAmountResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 添加分账接收方
   *
   * @param request 请求参数
   * @return AddReceiverResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public AddReceiverResponse addReceiver(AddReceiverRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/receivers/add";
    AddReceiverRequest realRequest = request;
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<AddReceiverResponse> httpResponse =
        httpClient.execute(httpRequest, AddReceiverResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 删除分账接收方
   *
   * @param request 请求参数
   * @return DeleteReceiverResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public DeleteReceiverResponse deleteReceiver(DeleteReceiverRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/receivers/delete";
    DeleteReceiverRequest realRequest = request;
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<DeleteReceiverResponse> httpResponse =
        httpClient.execute(httpRequest, DeleteReceiverResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 请求分账回退
   *
   * @param request 请求参数
   * @return CreateReturnOrderResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public CreateReturnOrderResponse createReturnOrder(CreateReturnOrderRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/returnorders";
    CreateReturnOrderRequest realRequest = request;
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(createRequestBody(realRequest))
            .build();
    HttpResponse<CreateReturnOrderResponse> httpResponse =
        httpClient.execute(httpRequest, CreateReturnOrderResponse.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 查询分账回退结果
   *
   * @param request 请求参数
   * @return QueryReturnOrderResponse
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws MalformedMessageException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public QueryReturnOrderResponse queryReturnOrder(QueryReturnOrderRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/brand/profitsharing/returnorders";

    QueryReturnOrderRequest realRequest = request;
    // 添加 query param
    QueryParameter queryParameter = new QueryParameter();
    if (realRequest.getSubMchid() != null) {
      queryParameter.add("sub_mchid", urlEncode(realRequest.getSubMchid()));
    }
    if (realRequest.getOutReturnNo() != null) {
      queryParameter.add("out_return_no", urlEncode(realRequest.getOutReturnNo()));
    }
    if (realRequest.getOrderId() != null) {
      queryParameter.add("order_id", urlEncode(realRequest.getOrderId()));
    }
    if (realRequest.getOutOrderNo() != null) {
      queryParameter.add("out_order_no", urlEncode(realRequest.getOutOrderNo()));
    }
    requestPath += queryParameter.getQueryStr();
    if (this.hostName != null) {
      requestPath = requestPath.replaceFirst(HostName.API.getValue(), hostName.getValue());
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, MediaType.APPLICATION_JSON.getValue());
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<QueryReturnOrderResponse> httpResponse =
        httpClient.execute(httpRequest, QueryReturnOrderResponse.class);
    return httpResponse.getServiceResponse();
  }

  private RequestBody createRequestBody(Object request) {
    return new JsonRequestBody.Builder().body(toJson(request)).build();
  }
}
