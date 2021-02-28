package com.sk.magicaldrops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.jetbrains.annotations.NotNull;

//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import java.io.Serializable;
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerDto implements Serializable {

    //@NotNull(message = "Name should not be empty")
    //@NotEmpty(message = "Name should not be empty")
    private String name;
    //@NotNull(message = "Phone should not be empty")
    //@NotEmpty(message = "Phone should not be empty")
    //@Size(min = 10,max = 10)
    private Long phone;
    //@NotNull(message = "DeliveryAddress should not be empty")
    //@NotEmpty(message = "DeliveryAddress should not be empty")
    private String deliveryAddress;
    //@NotNull(message = "Geolocation should not be empty")
    //@NotEmpty(message = "Geolocation should not be empty")
    private String geolocation;
}
