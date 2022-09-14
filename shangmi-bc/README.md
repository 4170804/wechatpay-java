# wechatpay-java-shangmi-bc 国密算法扩展

商密 (ShangMi)，俗称国密，是一组由[中国国家密码局](https://www.oscca.gov.cn/)标准化的密码学算法。微信支付 APIv3 在支持 RSA/AES 等算法的基础上，支持了国密算法。

`wechatpay-java-shangmi-bc` 是 `wechatpay-java` 的一个国密扩展。它基于 [Bouncy Castle](https://www.bouncycastle.org/java.html)，帮助开发者完成国密的签名、验签、加解密等工作。

## 前置条件

+ 了解 [wechatpay-java](https://github.com/wechatpay-apiv3/wechatpay-java)
+ 开通微信支付国密能力，申请**国密**证书，并下载**国密**微信支付平台证书。注：微信支付暂时没有开放国密的使用，请有需求的商户联系微信支付技术支持，获取国密接入文档。

## 安装

最新版本已经在 [Maven Central](https://search.maven.org/artifact/com.github.wechatpay-apiv3/wechatpay-java-shangmi-bc) 发布。

### Gradle
在你的 build.gradle 文件中加入如下的依赖
```groovy
implementation 'com.github.wechatpay-apiv3:wechatpay-java:0.1.0'
implementation 'com.github.wechatpay-apiv3:wechatpay-java-shangmi-bc:0.1.0'
```



#### Maven
加入以下依赖
```xml
<dependency>
  <groupId>com.github.wechatpay-apiv3</groupId>
  <artifactId>wechatpay-java</artifactId>
  <version>0.1.0</version>
</dependency>
<dependency>
  <groupId>com.github.wechatpay-apiv3</groupId>
  <artifactId>wechatpay-java-shangmi-bc</artifactId>
  <version>0.1.0</version>
</dependency>
```

## 使用国密 SDK

使用 `SMConfig` 替代 `RSAConfig` 初始化具体的业务服务，再调用服务提供的业务接口即可。国密的签名、验签会注入请求的各个环节。

```java
package com.wechat.pay.java.service;

import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.shangmi.bc.SMConfig;
import com.wechat.pay.java.service.payment.jsapi.JsapiService;
import com.wechat.pay.java.service.payment.jsapi.model.QueryOrderByIdRequest;
import com.wechat.pay.java.service.payment.model.Transaction;


public class QuickStart {

  /** 商户号 */
  public static String merchantId = "";
  /** 国密的商户API私钥路径 */
  public static String privateKeyPath = "";
  /** 国密的商户API证书序列号 */
  public static String merchantSerialNumber = "";
  /** 国密的微信支付平台证书路径 */
  public static String wechatPayCertificatePath = "";
  /** 微信支付 APIv3 密钥 */
  public static String apiV3Key = "";

  public static void main(String[] args) {
    Config config =
        new SMConfig.Builder()
            .merchantId(merchantId)
            .privateKeyFromPath(privateKeyPath)
            .merchantSerialNumber(merchantSerialNumber)
            .addWechatPayCertificateFromPath(wechatPayCertificatePath)
            .build();
    JsapiService service = new JsapiService.Builder().config(config).build();
    QueryOrderByIdRequest request = new QueryOrderByIdRequest();
    // 设置业务参数
    request.setMchid("****");
    request.setTransactionId("420***");
    Transaction transaction = service.queryOrderById(request);
  }
}
```

## 使用国密发送 HTTP 请求

如果 SDK 未支持你需要的接口，你可以使用 `SMConfig` + `DefaultHttpClientBuilder` 得到一个 HttpClient 发送 HTTP 请求，它会自动生成签名和验证签名。

```java
SMConfig config = new SMConfig.Builder()
        .merchantId(merchantId)
        .merchantSerialNumber(merchantSerialNo)
        .privateKey(privateKey)
        .addWechatPayCertificate(wechatPayCertificate).build();

HttpClient client = new DefaultHttpClientBuilder()
        .credential(config.createCredential())
        .validator(config.createValidator())
        .build();

HttpHeaders headers = new HttpHeaders();
headers.addHeader("Accept", "application/json");

// 你需要为应答编写对应的model
HttpResponse<DownloadCertificateResponse> response = client.get(
        headers,
        "https://api.mch.weixin.qq.com/v3/certificates",
        DownloadCertificateResponse.class);

System.out.println(response.getServiceResponse());
```

## 常见问题

### 请求时能同时使用国密和 RSA 吗？

SDK 支持创建多个 `service`，请使用 `RSAConfig` 和 `SMConfig` 分别构造对应的 `service`。
在发送请求时，再根据业务逻辑选择你希望使用的 `service`。

### 下载微信支付平台证书怎么失败了

开通国密后，微信支付平台证书下载接口会同时返回 RSA 和国密的多份证书。当前实现没有处理多种形式的加密，所以失败了。

微信支付平台证书下载接口可能会有调整，到时 SDK 会在第一时间适配。