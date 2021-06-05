package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Rating;
import com.team14.WebService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public Rating saveRating(Rating r){
        return ratingRepository.save(r);
    }
    public Rating getRating(int id){
        return ratingRepository.findById(id).orElse(null);
    }
}
