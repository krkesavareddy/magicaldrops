CREATE TABLE ORDERS
(ORDER_ID integer  AUTO_INCREMENT,
CONSUMER_ISDELETED Boolean,
CONSUMER_ID long,
CONSUMER_PHONE long,
CONSUMER_DELIVERY_ADDRESS varchar(50),
CONSUMER_ORDERED_CANPRICE double,
CONSUMER_ORDERTIME datetime,
PRODUCER_ID long,
PRODUCER_PHONE long,
PRODUCER_ADDRESS varchar(50),
ORDER_DELIVERYSTATUS boolean,
PRIMARY KEY (ORDER_ID)
); 
CREATE TABLE order_items_list(
    ORDER_ID integer NOT NULL,
    cantype varchar(50),
    cancount int,
    FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ORDER_ID)
);
select * from orders;
select * from oder_items_list;
drop table order_items_list;
drop table ORDERS;
