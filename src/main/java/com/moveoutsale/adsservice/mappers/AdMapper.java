package com.moveoutsale.adsservice.mappers;

import com.moveoutsale.adsservice.models.ads.request.CreateAdRequestModel;
import com.moveoutsale.adsservice.models.ads.response.CreateAdResponseModel;
import com.moveoutsale.adsservice.models.entity.AdEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shashidhar
 */
@Mapper(componentModel = "spring")
public interface AdMapper {

    AdMapper adMapper = Mappers.getMapper(AdMapper.class);

    /**
     * Mapping from AdEntity to CreateAdResponseModel
     * @param ad
     * @return createAdResponseModel
     */
    CreateAdResponseModel adEntityToCreateAdResponseModel(AdEntity ad);

    /**
     * Mapping from CreateAdRequestModel to AdEntity
     * @param createAdRequestModel
     * @return AdEntity
     */
    AdEntity createAdRequestModelToAdEntity(CreateAdRequestModel createAdRequestModel);

}
