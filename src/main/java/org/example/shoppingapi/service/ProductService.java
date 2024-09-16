package org.example.shoppingapi.service;

import org.example.shoppingapi.controller.dto.ProductRequest;
import org.example.shoppingapi.controller.dto.ProductResponse;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

}
