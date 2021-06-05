package com.team14.WebService.controller;

import com.team14.WebService.entity.Rating;
import com.team14.WebService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RatingController {
    @Autowired
    RatingService ratingService;

    @PostMapping("/addRating")
    public Rating saveRating(@RequestBody Rating r){
        return ratingService.saveRating(r);
    }
    @GetMapping("/getRating/{id}")
    public Rating getRating(@PathVariable int id){
        return ratingService.getRating(id);
    }
}
