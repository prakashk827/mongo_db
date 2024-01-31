package com.wdu.productservice.profile.service;


import com.wdu.productservice.invoice.exception.CustomException;
import com.wdu.productservice.profile.dto.ProfileDTO;
import com.wdu.productservice.profile.model.Profile;
import com.wdu.productservice.profile.repository.ProfileRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    ProfileRespository profileRespository;

    public Profile createProfile(Profile profile) {
        try {
            return profileRespository.save(profile);
        } catch (CustomException e) {
            throw CustomException.catchCustomException(e);
        } catch (Exception e) {
            throw CustomException.internalError();
        }
    }

    public List<Profile> viewProfile() {

        try {
            return profileRespository.findAll();
        } catch (CustomException e) {
            throw CustomException.catchCustomException(e);
        } catch (Exception e) {
            throw CustomException.internalError();
        }
    }



}
