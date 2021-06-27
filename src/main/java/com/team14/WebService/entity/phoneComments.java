package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phoneComments")
public class phoneComments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int phoneCommentId;

    private String phoneCommentName;
    private String phoneRating;

    @ManyToOne
    @JoinColumn(name="phone_id", nullable=false)
    private Phone phoneComments;

    public int getPhoneCommentId() {
        return phoneCommentId;
    }

    public void setPhoneCommentId(int phoneCommentId) {
        this.phoneCommentId = phoneCommentId;
    }

    public String getPhoneCommentName() {
        return phoneCommentName;
    }

    public void setPhoneCommentName(String phoneCommentName) {
        this.phoneCommentName = phoneCommentName;
    }

    public String getPhoneRating() {
        return phoneRating;
    }

    public void setPhoneRating(String phoneRating) {
        this.phoneRating = phoneRating;
    }

    public Phone getPhoneComments() {
        return phoneComments;
    }

    public void setPhoneComments(Phone phoneComments) {
        this.phoneComments = phoneComments;
    }


}
