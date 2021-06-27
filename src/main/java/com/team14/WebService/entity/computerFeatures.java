package com.team14.WebService.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "ComputerFeatures")
public class computerFeatures {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int compfeatureID;
    private String compFeatureName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="computerID")
    @JsonBackReference
    private Computer computerFeature;

    public int getCompfeatureID() {
        return compfeatureID;
    }

    public void setCompfeatureID(int compfeatureID) {
        this.compfeatureID = compfeatureID;
    }

    public String getCompFeatureName() {
        return compFeatureName;
    }

    public void setCompFeatureName(String compFeatureName) {
        this.compFeatureName = compFeatureName;
    }

    public Computer getComputerFeature() {
        return computerFeature;
    }

    public void setComputerFeature(Computer computerFeature) {
        this.computerFeature = computerFeature;
    }
}
