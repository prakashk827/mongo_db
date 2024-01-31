package com.wdu.productservice.signup.repository;

import com.wdu.productservice.signup.model.Signup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SignupRepository extends MongoRepository<Signup, String> {
}
