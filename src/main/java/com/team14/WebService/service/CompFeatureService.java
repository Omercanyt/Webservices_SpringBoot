package com.team14.WebService.service;

import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.repository.CompFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompFeatureService {
    @Autowired
    CompFeatureRepository compFeatureRepository;

    public computerFeatures saveCompFeature(computerFeatures cf){
        return compFeatureRepository.save(cf);
    }
    public computerFeatures getCompFeature(int id){
        return compFeatureRepository.findById(id).orElse(null);
    }
}
