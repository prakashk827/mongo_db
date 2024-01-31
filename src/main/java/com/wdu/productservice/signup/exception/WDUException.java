package com.wdu.productservice.signup.exception;

import com.wdu.productservice.signup.constant.SignupConstant;
import org.springframework.http.HttpStatus;

import java.io.Serial;

public class WDUException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer status;
    private String message;
    private Object resultMap;

    public WDUException(Integer status, String message, Object resultMap) {
        this.status = status;
        this.message = message;
        this.resultMap = resultMap;
    }

    public static WDUException catchPfException(Integer status, String message, Object resultMap) {
        return new WDUException(status, message, resultMap);
    }

    public static WDUException internalError(Object object) {

        return new WDUException(HttpStatus.INTERNAL_SERVER_ERROR.value(), SignupConstant.INTERNAL_ERROR,object);
    }
}
