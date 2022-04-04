package com.moveoutsale.adsservice.controllers;

import com.moveoutsale.adsservice.exception.ads.CreateAdException;
import com.moveoutsale.adsservice.models.ads.request.CreateAdRequestModel;
import com.moveoutsale.adsservice.models.ads.response.CreateAdResponseModel;
import com.moveoutsale.adsservice.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final AdsService adsService;

    @Autowired
    AdsController(AdsService adsService){
        this.adsService = adsService;
    }

    @PostMapping( consumes = "application/json", produces = "application/json")
    public ResponseEntity<CreateAdResponseModel> createAd(@RequestBody CreateAdRequestModel createAdRequestModel) {
        CreateAdResponseModel createAdResponseModel = null;
        try{
            this.adsService.postAd(createAdRequestModel);
            createAdResponseModel = new CreateAdResponseModel();
            createAdResponseModel.setTitle(createAdRequestModel.getTitle());
            return new ResponseEntity<>(createAdResponseModel, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("coming here");
            throw new CreateAdException(e.getMessage());
        }
    }

}
