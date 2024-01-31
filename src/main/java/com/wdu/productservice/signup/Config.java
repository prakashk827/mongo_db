package com.wdu.productservice.signup;

import com.wdu.productservice.signup.model.Signup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SignupDTO signupDTO() {
        return new SignupDTO();
    }

    @Bean
    public Signup signup() {
        return new Signup();
    }
}
