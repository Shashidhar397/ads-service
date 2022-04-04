package com.moveoutsale.adsservice.services;

import com.moveoutsale.adsservice.models.ads.request.CreateAdRequestModel;
import com.moveoutsale.adsservice.models.ads.response.CreateAdResponseModel;

/**
 * @author shashidhar
 */
public interface AdsService {

    /**
     * postAd method to create new ad
     * @param createAdRequestModel
     * @return createAdResponseModel
     */
    CreateAdResponseModel postAd(CreateAdRequestModel createAdRequestModel);
}
