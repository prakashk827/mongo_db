package com.wdu.productservice.invoice.exception;

import com.wdu.productservice.signup.constant.SignupConstant;
import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.util.ArrayList;

public class CustomException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer status;
    private String message;
    private Object resultMap;

    public CustomException(Integer status, String message, Object resultMap) {
        this.status = status;
        this.message = message;
        this.resultMap = resultMap;
    }

    public static CustomException catchCustomException(Integer status, String message, Object resultMap) {
        return new CustomException(status, message, resultMap);
    }

    public static CustomException catchCustomException(CustomException e) {
        return new CustomException(e.getStatus(), e.getMessage(), e.getResultMap());
    }

    public static CustomException internalError(Object object) {

        return new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), SignupConstant.INTERNAL_ERROR, object);
    }

    public static CustomException internalError() {

        return new CustomException(HttpStatus.INTERNAL_SERVER_ERROR.value(), SignupConstant.INTERNAL_ERROR, new ArrayList<>());
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResultMap() {
        return resultMap;
    }

    public void setResultMap(Object resultMap) {
        this.resultMap = resultMap;
    }
}
