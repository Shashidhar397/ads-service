package com.moveoutsale.adsservice.repositories;

import com.moveoutsale.adsservice.models.entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shashidhar
 */
@Repository
public interface AdRepository extends JpaRepository<AdEntity, Long> {
}
