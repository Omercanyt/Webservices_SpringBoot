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

public class computerFeatures {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int compfeatureID;
    private String compFeatureName;
    @ManyToMany(mappedBy = "cofeatuers", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Computer> cofets = new HashSet<>();

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

    public Set<Computer> getCofets() {
        return cofets;
    }

    public void setCofets(Set<Computer> cofets) {
        this.cofets = cofets;
    }
}
