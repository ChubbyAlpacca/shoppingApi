package org.example.shoppingapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "PRODUCTS")
@RequiredArgsConstructor
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CATEGORY")
    private String category;
}
