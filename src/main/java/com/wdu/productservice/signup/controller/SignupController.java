package com.wdu.productservice.signup.controller;

import com.wdu.productservice.signup.SignupDTO;
import com.wdu.productservice.signup.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/signup")
public class SignupController {

    @Autowired
    SignupService signupService;

    @PostMapping("/create/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody SignupDTO signupDTO) {
        System.out.println("Inside controller");
        signupService.createNewUser(signupDTO);
    }
}
