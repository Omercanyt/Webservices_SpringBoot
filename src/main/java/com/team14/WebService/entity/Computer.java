package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Computer")

@Entity

public class Computer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "computerID")
    private int computerID;

    @Column(name = "computerPrice")
    private float computerPrice;

    @Column(name = "computerScreenSize")
    private String computerScreenSize;

    @Column(name = "computerModel")
    private String computerModel;

    @Column(name = "computerBrand")
    private String phoneBrand;

    @Column(name = "screenResolution")
    private String screenResolution;

    @Column(name = "processor")
    private String processor;

    @Column(name = "memory")
    private String memory;

    @Column(name = "storageCapacity")
    private String storageCapacity;

    @ElementCollection
    @CollectionTable(
            name = "computerFeautres",
            joinColumns = @JoinColumn(name = "computerID")
    )


    @OneToMany(targetEntity = Rating.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "computer_fk", referencedColumnName = "computerID")
    private List<Rating> computerRatings;

}
