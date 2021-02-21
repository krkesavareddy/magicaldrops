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
@Table(name="ORDERS")
public class OrderEntity {
    @Id
    @Column(name="ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column(name="CONSUMER_ISDELETED ")
    private Boolean consumerIsDeleted = false;
    @Column(name="CONSUMER_ID")
    private Long consumerId;
    @Column(name="CONSUMER_PHONE")
    private Long consumerPhone;
    @Column(name="CONSUMER_DELIVERY_ADDRESS ")
    private String consumerDeliveryAddress;
    @ElementCollection
    @CollectionTable(name = "ORDER_ITEMS_LIST",
            joinColumns = {
            @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    })
    @MapKeyColumn(name = "cantype")
    @Column(name = "cancount")
    private Map<String, Integer> consumerOrderedCanDetails;

    @Column(name="CONSUMER_ORDERED_CANPRICE")
    private Double consumerOrderdCanPrice;
    @Column(name="CONSUMER_ORDERTIME")
    private Instant consumerOrderTime= Instant.now();

    @Column(name="PRODUCER_ID")
    private Long producerId;
    @Column(name="PRODUCER_PHONE")
    private Long ProducerPhone;
    @Column(name="PRODUCER_ADDRESS")
    private String ProducerAddress;
    @Column(name="ORDER_DELIVERYSTATUS")
    private Boolean orderDeliveryStatus =false;


}
//when  i was  writing this i am assuming consumers already registerd before placing order