package com.team14.WebService.repository;

import com.team14.WebService.entity.phoneFeatures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneFeatureRepository  extends JpaRepository<phoneFeatures, Integer> {
}
