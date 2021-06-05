package com.team14.WebService.repository;

import com.team14.WebService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository  extends JpaRepository<Rating, Integer> {
}
