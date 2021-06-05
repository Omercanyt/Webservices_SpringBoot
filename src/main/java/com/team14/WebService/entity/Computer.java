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

public class Computer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int computerID;
    private float computerPrice;
    private String computerScreenSize;
    private String computerModel;
    private String computerBrand;
    private String screenResolution;
    private String processor;
    private String memory;
    private String storageCapacity;
    @OneToMany(mappedBy = "computerR", cascade = CascadeType.ALL)
    private List<Rating> computerRatings;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "computerfeatureRelation",joinColumns = @JoinColumn(name="computerID"), inverseJoinColumns = @JoinColumn(name = "compfeatureID"))
    private List<computerFeatures> cofeatuers = new ArrayList<>();

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

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
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

    public List<Rating> getComputerRatings() {
        return computerRatings;
    }

    public void setComputerRatings(List<Rating> computerRatings) {
        this.computerRatings = computerRatings;
    }

    public List<computerFeatures> getCofeatuers() {
        return cofeatuers;
    }

    public void setCofeatuers(List<computerFeatures> cofeatuers) {
        this.cofeatuers = cofeatuers;
    }
}
