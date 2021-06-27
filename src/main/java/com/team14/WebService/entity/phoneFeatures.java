package com.team14.WebService.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class phoneFeatures {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int phonefeatureID;

    private String phoneFeatureName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="phone_id")
    @JsonBackReference
    private Phone phoneFeatures;

    public int getPhonefeatureID() {
        return phonefeatureID;
    }

    public void setPhonefeatureID(int phonefeatureID) {
        this.phonefeatureID = phonefeatureID;
    }

    public String getPhoneFeatureName() {
        return phoneFeatureName;
    }

    public void setPhoneFeatureName(String phoneFeatureName) {
        this.phoneFeatureName = phoneFeatureName;
    }

    public Phone getPhoneFeatures() {
        return phoneFeatures;
    }

    public void setPhoneFeatures(Phone phoneFeatures) {
        this.phoneFeatures = phoneFeatures;
    }
}
