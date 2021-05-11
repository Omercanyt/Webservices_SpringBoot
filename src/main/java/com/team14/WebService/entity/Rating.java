package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="RATING")

public class Rating {
        @Id
        @Column(name="ratingID")
        private int ratingID;
        @Column(name="starRating")
        private float starRating;
        @Column(name="comment")
        private String comment;
}
