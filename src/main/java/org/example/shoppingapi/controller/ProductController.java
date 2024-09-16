package org.example.shoppingapi.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.shoppingapi.controller.dto.ProductRequest;
import org.example.shoppingapi.controller.dto.ProductResponse;
import org.example.shoppingapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ProductController {

    /*
    TODO create the following endPoints
    - post/product
    -get/product/{id}
    -get/products (optional header of type?)
     */
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> postNewProduct(@RequestBody ProductRequest productRequest) {
        return new ResponseEntity<>(productService.createProduct(productRequest), HttpStatus.CREATED);
    }
}
