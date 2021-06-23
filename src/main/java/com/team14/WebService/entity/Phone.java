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
    @OneToMany(mappedBy = "phoneR", cascade = CascadeType.ALL)
    private List<Rating> phoneRatings;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "phonefeatureRelation", joinColumns = @JoinColumn(name="phone_fkid"),inverseJoinColumns = @JoinColumn(name = "phonefeaturefkID"))
    private List<phoneFeatures> phofeatures = new ArrayList<>();


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

    public List<Rating> getPhoneRatings() {
        return phoneRatings;
    }

    public void setPhoneRatings(List<Rating> phoneRatings) {
        this.phoneRatings = phoneRatings;
    }

    public List<phoneFeatures> getPhofeatures() {
        return phofeatures;
    }

    public void setPhofeatures(List<phoneFeatures> phofeatures) {
        this.phofeatures = phofeatures;
    }
}
