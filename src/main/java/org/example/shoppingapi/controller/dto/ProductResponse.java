package org.example.shoppingapi.controller.dto;

import lombok.Data;

@Data
public class ProductResponse {

    private long id;
    private String name;
    private String description;
    private double price;

}
