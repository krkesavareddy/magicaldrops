CREATE TABLE orders
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
    ORDER_ID integer,
    cantype varchar(50),
    cancount integer,
    FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ORDER_ID)
);

create table consumers
( consumer_id INTEGER AUTO_INCREMENT,
  consumer_name  VARCHAR(50),
  consumer_phone  VARCHAR(50),
  consumer_address  VARCHAR(50),
  consumer_geolocation  VARCHAR(50),
  is_otpvalidated TINYINT(1),
  PRIMARY KEY ( consumer_id)
);
