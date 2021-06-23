package com.team14.WebService.controller;

import com.team14.WebService.entity.phoneFeatures;
import com.team14.WebService.service.PhoneFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneFeatureController {
    @Autowired
    PhoneFeatureService phoneFeatureService;

    @PostMapping("/addPhoneFeature")
    public phoneFeatures savePhoneFeature(@RequestBody phoneFeatures r){
        return phoneFeatureService.savePhoneFeature(r);
    }
    @GetMapping("/getPhoneFeature/{id}")
    public phoneFeatures getPhoneFeature(@PathVariable int id){
        return phoneFeatureService.getPhoneFeature(id);
    }
}
