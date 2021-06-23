package com.team14.WebService.entity;

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
    @ManyToMany(mappedBy = "phofeatures", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Phone> phofets = new ArrayList<>();

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

    public List<Phone> getPhofets() {
        return phofets;
    }

    public void setPhofets(List<Phone> phofets) {
        this.phofets = phofets;
    }
}
