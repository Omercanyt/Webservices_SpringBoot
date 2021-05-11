package com.team14.WebService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="phone_id")
    private int phone_id;

    @Column(name="phone_model")
    private String phone_model;

    @Column(name="phone_brand")
    private String phone_brand;

    @Column(name="phone_screenSize")
    private String phone_screenSize;

    @Column(name="phone_internalMemory")
    private String phone_internalMemory;

    @Column(name="phone_price")
    private float price;

    @OneToMany(targetEntity = Rating.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_fk", referencedColumnName = "phone_id")
    private List<Rating> ratings;

    @ElementCollection
    @CollectionTable(
            name = "PhoneFeatures",
            joinColumns = @JoinColumn(name = "phone_id")
    )
    private List<String> phone_features;
}
