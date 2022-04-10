package com.wiulus.example.exception;

import com.wiulus.example.common.constant.BusinessExceptionCode;
import com.wiulus.example.common.exception.BusinessException;

/**
 * @author WiuLuS
 */

public class DemoException extends BusinessException {
    private static final long serialVersionUID = 2674673804407663043L;

    public DemoException() {
        super();
    }

    public DemoException(BusinessExceptionCode userApiExceptionCode) {
        super(userApiExceptionCode.getCode(), userApiExceptionCode.getMessage());
    }

    public DemoException(BusinessExceptionCode contractExceptionCode, Object data) {
        super(contractExceptionCode.getCode(), contractExceptionCode.getMessage(), data);
    }

    public DemoException(String code, String message) {
        super(code, message);
    }

    public DemoException(String code, String message, Object data) {
        super(code, message, data);
    }

    public DemoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoException(Throwable cause) {
        super(cause);
    }
    
}
