package com.sk.magicaldrops.mapper;

import com.sk.magicaldrops.Entity.ConsumerEntity;
import com.sk.magicaldrops.dto.ConsumerDto;

public class Converter {
    public static ConsumerEntity transferToEntity(ConsumerDto dto){
        ConsumerEntity entity =new ConsumerEntity();
        System.out.println("=============================================================");
        System.out.println(entity.getConsumerId());
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        entity.setGeoLocation(dto.getGeolocation());
        entity.setAddress(dto.getDeliveryAddress());
        return  entity;
    }
}
