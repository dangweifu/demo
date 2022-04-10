package com.wiulus.example.common.exception;


import com.wiulus.example.common.constant.BusinessExceptionCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WiuLuS
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 2303787632025488805L;
    private String code;
    private String message;
    private Object data;

    public BusinessException() {
    }

    public BusinessException(BusinessExceptionCode businessExceptionCode) {
        this.code = businessExceptionCode.getCode();
        this.message = businessExceptionCode.getMessage();
    }

    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BusinessException(Throwable cause) {
        super(cause);
        if (cause != null) {
            this.message = cause.getMessage();
        }

    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void putMapData(String key, Object value) {
        if (this.data == null) {
            this.data = new HashMap();
        }

        if (this.data instanceof Map) {
            ((Map)this.data).put(key, value);
        }

    }
}
