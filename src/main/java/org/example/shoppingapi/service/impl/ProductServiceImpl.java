package org.example.shoppingapi.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.shoppingapi.controller.dto.ProductRequest;
import org.example.shoppingapi.controller.dto.ProductResponse;
import org.example.shoppingapi.entity.Product;
import org.example.shoppingapi.repository.ProductRepository;
import org.example.shoppingapi.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public ProductResponse createProduct(ProductRequest request) {
        productRepository.
    }
}
