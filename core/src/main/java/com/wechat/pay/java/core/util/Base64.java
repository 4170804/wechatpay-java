package com.wechat.pay.java.core.util;


public class Base64 {

  public static Base64 instance= new Base64();
  public static  Base64 getEncoder()
  {
    return instance;
  }
  public static  Base64 getDecoder()
  {
    return instance;
  }

  public byte[] decode(String src) {
    return  android.util.Base64.decode(src, android.util.Base64.NO_WRAP);
  }

  public String encodeToString(byte[] src)
  {
    return android.util.Base64.encodeToString(src, android.util.Base64.NO_WRAP);
  }

}
