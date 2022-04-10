package com.wiulus.example.common.constant;

/**
 * @author WiuLuS
 */
public enum BusinessExceptionCode {

    /**  */
    PARAM_INVALID("common-0400", "参数不正确"),
    /**  */
    PERMISSION_DENY("common-0403", "越权操作"),
    /**  */
    SYSTEM_ERROR("common-0500", "服务器异常");

    /** 异常编码 */
    private final String code;
    /** 异常信息 */
    private final String message;

    private BusinessExceptionCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
