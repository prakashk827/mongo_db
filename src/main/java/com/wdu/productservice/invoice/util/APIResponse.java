package com.wdu.productservice.invoice.util;

import com.wdu.productservice.invoice.exception.CustomException;
import com.wdu.productservice.profile.constant.ProfileConstant;
import com.wdu.productservice.signup.constant.SignupConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public final class APIResponse {

    public static ResponseEntity<Response> OK(Integer status, String message, Object result) {
        Response response = new Response();
        response.setStatus(status);
        response.setMessage(message);
        response.setResult(result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<Response> OK(Object result) {
        Response response = new Response();
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("success");
        response.setResult(result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    public static ResponseEntity<Response> BAD_REQUEST(CustomException e) {

        Response response = new Response();
        response.setStatus(e.getStatus());
        response.setMessage(e.getMessage());
        response.setResult(e.getResultMap());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<Response> INTERNAL_SERVER_ERROR() {

        Response response = new Response();
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(ProfileConstant.INTERNAL_ERROR);
        response.setResult(new ArrayList<>());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<Response> NOT_FOUND() {


        Response response = new Response();
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setMessage(ProfileConstant.NO_RECORDS_FOUND);
        response.setResult(new ArrayList<>());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
