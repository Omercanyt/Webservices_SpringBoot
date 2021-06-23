package com.team14.WebService.service;

import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.entity.phoneFeatures;
import com.team14.WebService.repository.PhoneFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneFeatureService {
    @Autowired
    PhoneFeatureRepository phoneFeatureRepository;

    public phoneFeatures savePhoneFeature(phoneFeatures pf){
        return phoneFeatureRepository.save(pf);
    }
    public phoneFeatures getPhoneFeature(int id){
        return phoneFeatureRepository.findById(id).orElse(null);
    }
}

