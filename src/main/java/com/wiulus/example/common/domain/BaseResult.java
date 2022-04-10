package com.wiulus.example.common.domain;

import java.io.Serializable;

/**
 * @author WiuLuS
 */
public class BaseResult implements Serializable {
    private static final long serialVersionUID = 6117360723257085240L;
    protected static final String SUCCESS_CODE = "common-0001";
    protected static final String ERROR_CODE = "common-0000";
    protected static final String SUCCESS_DEFAULT_MESSAGE = "操作成功";
    protected static final String FAILURE_DEFAULT_MESSAGE = "操作失败";
    protected String code;
    protected String message;

    public BaseResult() {
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
}