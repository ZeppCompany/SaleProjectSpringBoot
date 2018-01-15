package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.Product;
import com.draslarsesiri.draslarsesiri.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()){
            throw new RuntimeException("Proizvod nije pronađen!");
        }

        return product.get();
    }

}
