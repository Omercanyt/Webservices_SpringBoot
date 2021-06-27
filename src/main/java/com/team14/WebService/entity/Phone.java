package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int phone_id;
    private String phone_model;
    private String phone_brand;
    private String phone_screenSize;
    private String phone_internalMemory;
    private float price;


    @OneToMany(mappedBy="phoneComments")
    private Set<phoneComments> phoneComments;

    @OneToMany(mappedBy="phoneFeatures")
    private Set<phoneFeatures> phoneFeatures;

    public int getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }

    public String getPhone_model() {
        return phone_model;
    }

    public void setPhone_model(String phone_model) {
        this.phone_model = phone_model;
    }

    public String getPhone_brand() {
        return phone_brand;
    }

    public void setPhone_brand(String phone_brand) {
        this.phone_brand = phone_brand;
    }

    public String getPhone_screenSize() {
        return phone_screenSize;
    }

    public void setPhone_screenSize(String phone_screenSize) {
        this.phone_screenSize = phone_screenSize;
    }

    public String getPhone_internalMemory() {
        return phone_internalMemory;
    }

    public void setPhone_internalMemory(String phone_internalMemory) {
        this.phone_internalMemory = phone_internalMemory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Set<com.team14.WebService.entity.phoneComments> getPhoneComments() {
        return phoneComments;
    }

    public void setPhoneComments(Set<com.team14.WebService.entity.phoneComments> phoneComments) {
        this.phoneComments = phoneComments;
    }

    public Set<com.team14.WebService.entity.phoneFeatures> getPhoneFeatures() {
        return phoneFeatures;
    }

    public void setPhoneFeatures(Set<com.team14.WebService.entity.phoneFeatures> phoneFeatures) {
        this.phoneFeatures = phoneFeatures;
    }
}
