package com.moveoutsale.adsservice.controllers;

import com.moveoutsale.adsservice.exception.ads.CreateAdException;
import com.moveoutsale.adsservice.models.ads.request.CreateAdRequestModel;
import com.moveoutsale.adsservice.models.ads.response.AdResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shashidhar
 */
@RestController
@RequestMapping(value = "/ad")
public class AdsController {

    @PostMapping( consumes = "application/json", produces = "application/json")
    public ResponseEntity<AdResponseModel> createAd(@RequestBody CreateAdRequestModel createAdRequestModel) {
        AdResponseModel adsAdResponseModel = null;
        try{
            adsAdResponseModel = new AdResponseModel();
            adsAdResponseModel.setName(createAdRequestModel.getName());
            return new ResponseEntity<>(adsAdResponseModel, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("coming here");
            throw new CreateAdException(e.getMessage());
        }
    }

}
