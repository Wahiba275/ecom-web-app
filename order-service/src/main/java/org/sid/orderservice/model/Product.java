package org.sid.orderservice.model;

import lombok.Data;

@Data
public class Product {
    private Long id ;
    private String Name ;
    private double price ;
    private int quantity;
}
