package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Rating {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int ratingID;
        private float starRating;
        private String comment;
        @ManyToOne
        private Phone phoneR;
        @ManyToOne
        private Computer computerR;

        public int getRatingID() {
                return ratingID;
        }

        public void setRatingID(int ratingID) {
                this.ratingID = ratingID;
        }

        public float getStarRating() {
                return starRating;
        }

        public void setStarRating(float starRating) {
                this.starRating = starRating;
        }

        public String getComment() {
                return comment;
        }

        public void setComment(String comment) {
                this.comment = comment;
        }

        public Phone getPhoneR() {
                return phoneR;
        }

        public void setPhoneR(Phone phoneR) {
                this.phoneR = phoneR;
        }

        public Computer getComputerR() {
                return computerR;
        }

        public void setComputerR(Computer computerR) {
                this.computerR = computerR;
        }
}
