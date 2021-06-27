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
@Table(name="Computer")
public class Computer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "computerID")
    private int computerID;
    private float computerPrice;
    private String computerScreenSize;
    private String computerModel;
    private String computerBrand;
    private String screenRes;
    private String processor;
    private String memory;
    private String storageCapacity;

    @OneToMany(mappedBy="computerComments")
    private Set<computerComments> computerComments;

    @OneToMany(mappedBy="computerFeature")
    private Set<computerFeatures> computerFeatures;

    public int getComputerID() {
        return computerID;
    }

    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }

    public float getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(float computerPrice) {
        this.computerPrice = computerPrice;
    }

    public String getComputerScreenSize() {
        return computerScreenSize;
    }

    public void setComputerScreenSize(String computerScreenSize) {
        this.computerScreenSize = computerScreenSize;
    }

    public String getComputerModel() {
        return computerModel;
    }

    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    public String getScreenRes() {
        return screenRes;
    }

    public void setScreenRes(String screenRes) {
        this.screenRes = screenRes;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Set<com.team14.WebService.entity.computerComments> getComputerComments() {
        return computerComments;
    }

    public void setComputerComments(Set<com.team14.WebService.entity.computerComments> computerComments) {
        this.computerComments = computerComments;
    }

    public Set<com.team14.WebService.entity.computerFeatures> getComputerFeatures() {
        return computerFeatures;
    }

    public void setComputerFeatures(Set<com.team14.WebService.entity.computerFeatures> computerFeatures) {
        this.computerFeatures = computerFeatures;
    }
}
