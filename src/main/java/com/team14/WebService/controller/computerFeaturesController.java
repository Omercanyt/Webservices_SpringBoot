package com.team14.WebService.controller;

import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.service.computerFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class computerFeaturesController {

    @Autowired
    computerFeaturesService computerFeaturesServiceObj;

    @PostMapping("/addComputerFeatures")
    public computerFeatures saveComputerFeatures(@RequestBody computerFeatures cf) { return computerFeaturesServiceObj.saveComputerFeature(cf);}

    @GetMapping("/getComputerFeatures/{id}")
    public computerFeatures getComputerFeatures(@PathVariable int id) { return computerFeaturesServiceObj.getComputerFeature(id); }

    @GetMapping("/getAllComputerFeatures")
    public List<computerFeatures> getAllComputerFeatures() { return computerFeaturesServiceObj.getAllComputerFeatures();}

    @GetMapping("/getAllComputerFeaturesByComputerID/{id}")
    public List<computerFeatures> getAllComputerFeaturesByComputerID(@PathVariable int id) { return computerFeaturesServiceObj.getAllComputerFeaturesByComputerID(id);}

}
