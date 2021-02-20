package com.sk.magicaldrops.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
public class OrderEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Boolean consumerIsDeleted = false;
    private Long consumerId;
    private Long consumerPhone;
    private String consumerDeliveryAddress;
    @ElementCollection
    @CollectionTable(name = "order_items_list",
            joinColumns = {
            @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    })
    @MapKeyColumn(name = "cantype")
    @Column(name = "cancount")
    private Map<String, Integer> consumerOrderedCanDetails;
    private Double consumerOrderdCanPrice;
    private Instant consumerOrderTime= Instant.now();

    private Long producerId;
    private Long ProducerPhone;
    private String ProducerAddress;
    private Boolean orderDeliveryStatus =false;


}
//when  i was  writing this i am assuming consumers already registerd before placing order