package com.zp.mall.tiny.common.api;

/**
 * @author ZP
 * @date 2021/3/28.
 * 封装API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}