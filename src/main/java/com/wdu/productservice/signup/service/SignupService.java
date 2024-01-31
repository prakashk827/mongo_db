package com.wdu.productservice.signup.service;

import com.wdu.productservice.signup.SignupDTO;
import com.wdu.productservice.signup.model.Signup;
import com.wdu.productservice.signup.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    Signup signup;

    @Autowired
    SignupRepository signupRepository;


    public void createNewUser(SignupDTO signupDTO) {

        try {
            signup.setFirstName(signupDTO.getFirstName());
            signup.setLastName(signupDTO.getLastName());
            signup.setEmailId(signupDTO.getEmailId());
            signup.setPassword(signupDTO.getPassword());

            signupRepository.save(signup);


        } catch (Exception e) {

        }


    }
}
