package com.sk.magicaldrops.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="PRODUSER")
public class Produser{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUSER_ID")
    private Long ProduserId;
    @Column(name="PRODUSER_NAME")
    private String shopName;
    @Column(name="PRODUSER_ADDRESS")
    private String shopAddress;
    @Column(name="GEO_LOCATION")
    private String geoLocation;
    // private String canTypeAvailable;
    @Column(name="PHONE_NUMBER")
    private Long phoneNumber;

}