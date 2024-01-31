package com.wdu.productservice.profile.controller;


import com.wdu.productservice.invoice.exception.CustomException;
import com.wdu.productservice.invoice.util.APIResponse;
import com.wdu.productservice.invoice.util.Response;
import com.wdu.productservice.profile.dto.ProfileDTO;
import com.wdu.productservice.profile.model.Profile;
import com.wdu.productservice.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @Autowired
    MongoTemplate mongoTemplate;

    @PostMapping("/create")
    public ResponseEntity<Response> createProfile(@RequestBody Profile profile) {


        Profile profileRes;

        try {
            profileRes = profileService.createProfile(profile);
        } catch (CustomException e) {
            return APIResponse.BAD_REQUEST(e);
        } catch (Exception e) {
            return APIResponse.INTERNAL_SERVER_ERROR();
        }
        return APIResponse.OK(profileRes);
    }

    @GetMapping("/view")
    public ResponseEntity<Response> viewProfile() {
        List<Profile> profileList;
        try {
            profileList = profileService.viewProfile();

            if (profileList.isEmpty()) {
                return APIResponse.NOT_FOUND();
            }

        } catch (CustomException e) {
            return APIResponse.BAD_REQUEST(e);
        } catch (Exception e) {
            return APIResponse.INTERNAL_SERVER_ERROR();
        }

        return APIResponse.OK(profileList);

    }

    @GetMapping("/view/{full_name}")
    public ResponseEntity<Response> viewProfileByName(@PathVariable("full_name") String fullName) {
        List<Profile> profileList;
        try {

            Query query = new Query();
            Criteria criteria =  Criteria.where("fullName").regex(fullName);
            query.addCriteria(criteria).limit(10);
            profileList = mongoTemplate.find(query, Profile.class);
            if (profileList.isEmpty()) {
                return APIResponse.NOT_FOUND();
            }
            System.out.println("Profile List " + profileList);
        } catch (CustomException e) {
            return APIResponse.BAD_REQUEST(e);
        } catch (Exception e) {
            return APIResponse.INTERNAL_SERVER_ERROR();
        }

        return APIResponse.OK(profileList);

    }


}
