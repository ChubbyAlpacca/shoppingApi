package org.example.shoppingapi.controller.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class ProductRequest {

        @Getter
        private String name;
        private String description;
        private double price;


}
