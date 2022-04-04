package com.moveoutsale.adsservice.services;

import com.moveoutsale.adsservice.mappers.AdMapper;
import com.moveoutsale.adsservice.models.ads.request.CreateAdRequestModel;
import com.moveoutsale.adsservice.models.ads.response.CreateAdResponseModel;
import com.moveoutsale.adsservice.models.entity.AdEntity;
import com.moveoutsale.adsservice.repositories.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shashidhar
 */
@Service
public class AdServiceImpl implements AdsService{

    private final AdRepository adRepository;

    private final AdMapper adMapper;

    @Autowired
    public AdServiceImpl(AdRepository adRepository, AdMapper adMapper) {
        this.adRepository = adRepository;
        this.adMapper = adMapper;
    }

    @Override
    public CreateAdResponseModel postAd(CreateAdRequestModel createAdRequestModel) {
        AdEntity adEntity = this.adMapper.createAdRequestModelToAdEntity(createAdRequestModel);
        return null;
    }
}
