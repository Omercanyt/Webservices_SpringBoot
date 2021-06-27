package com.team14.WebService.controller;

import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.entity.phoneFeatures;
import com.team14.WebService.service.phoneFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class phoneFeaturesController {
    @Autowired
    phoneFeaturesService phoneFeaturesServiceObj;

    @PostMapping("/addPhoneFeatures")
    public phoneFeatures savePhoneFeatures(@RequestBody phoneFeatures pf) { return phoneFeaturesServiceObj.savePhoneFeature(pf);}
    @GetMapping("/getPhoneFeatures/{id}")
    public phoneFeatures getPhoneFeatures(@PathVariable int id) { return phoneFeaturesServiceObj.getPhoneFeature(id); }
    @GetMapping("/getAllPhoneFeatures")
    public List<phoneFeatures> getAllPhoneFeatures() { return phoneFeaturesServiceObj.getAllPhoneFeatures();}
    @GetMapping("/getPhoneFeaturesByID/{id}")
    public List<phoneFeatures> getAllPhoneFeaturesByID(@PathVariable int id) {return phoneFeaturesServiceObj.getAllPhoneFeaturesByPhoneID(id);}

}
