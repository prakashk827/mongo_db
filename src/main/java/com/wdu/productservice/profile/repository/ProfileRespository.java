package com.wdu.productservice.profile.repository;

import com.wdu.productservice.profile.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRespository extends MongoRepository<Profile, String> {

      


}
