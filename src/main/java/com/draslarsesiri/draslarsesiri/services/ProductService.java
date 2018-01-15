package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProduct();
    Product findById(int productId);
}
