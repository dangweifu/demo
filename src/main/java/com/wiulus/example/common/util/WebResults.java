package com.wiulus.example.common.util;

import com.wiulus.example.common.domain.BaseResult;
import com.wiulus.example.common.exception.BusinessException;

import java.io.Serializable;

/**
 * 这个result 为重写。可以方便生成接口文档
 *
 * @author changhaipeng
 * 2020/11/23 16:40
 * @Version: 2.17.0
 */
public class WebResults<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = -3034301059579740420L;
    private T data;

    public WebResults() {
    }

    private WebResults(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> WebResults<T> build(String code, String message) {
        return new WebResults<T>(code, message, null);
    }

    public static <T> WebResults<T> build(String code, String message, T data) {
        return new WebResults<T>(code, message, data);
    }

    public static <T> WebResults<T> createSuccessResult() {
        return new WebResults<T>("common-0001", "操作成功", null);
    }

    public static <T> WebResults<T> createSuccessResult(T data) {
        return new WebResults<T>("common-0001", "操作成功", data);
    }

    public static <T> WebResults<T> createSuccessResult(String code, String message, T data) {
        return new WebResults<T>(code, message, data);
    }

    public static <T> WebResults<T> createFailureResult() {
        return new WebResults<T>("common-0000", "操作失败", null);
    }

    public static <T> WebResults<T> createFailureResult(BusinessException exception) {
        return new WebResults<T>(exception.getCode(), exception.getMessage(), null);
    }

    public static <T> WebResults<T> createFailureResult(BusinessException exception, T data) {
        return new WebResults<T>(exception.getCode(), exception.getMessage(), data);
    }

    public static <T> WebResults<T> createFailureResult(T data) {
        return new WebResults<T>("common-0000", "操作失败", data);
    }

    public static <T> WebResults<T> createFailureResult(String code, String message, T data) {
        return new WebResults<T>(code, message, data);
    }

    @Override
    public String toString() {
        return "WebResults{data=" + this.data + ", code='" + this.code + '\'' + ", message='" + this.message + '\'' + '}';
    }
}
