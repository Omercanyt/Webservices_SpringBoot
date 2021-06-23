package com.team14.WebService.controller;

import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.service.CompFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompFeatureController {
    @Autowired
    CompFeatureService compFeatureService;

    @PostMapping("/addCompFeature")
    public computerFeatures saveCompFeature(@RequestBody computerFeatures r){
        return compFeatureService.saveCompFeature(r);
    }
    @GetMapping("/getCompFeature/{id}")
    public computerFeatures getCompFeature(@PathVariable int id){
        return compFeatureService.getCompFeature(id);
    }
}
