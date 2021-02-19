package com.sk.magicaldrops.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Data
@NoArgsConstructor
@ToString
@Table(name="CONSUMERS")
@Entity
public class ConsumerEntity implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "CONSUMER_ID")
   private Long consumerId;

    @Column(name ="CONSUMER_NAME",nullable = false)
    @NotNull(message = "name can not be null!")
    private String Name;

    @Column(name ="CONSUMER_PHONE",nullable = false)
    @Size(min=10,max=10)
    @NotNull(message = "phone can not be null!")
    private Long Phone;

    @Column(name ="CONSUMER_ADDRESS",nullable = false)
    @NotNull(message = "address can not be null!")
    private String address;

    @Column(name ="CONSUMER_GEOLOCATION",nullable = false)
    @NotNull(message = "GioLocation can not be null!")
    private String geoLocation;

    @Column(name ="IS_OTPVALIDATED")
    private Boolean isValidated =false;

}
