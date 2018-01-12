package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.ProductDedicated;
import com.draslarsesiri.draslarsesiri.repositories.ProductDedicatedRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductDedicatedServiceImpl implements ProductDedicatedService{

    private ProductDedicatedRepository productDedicatedRepository;

    @Autowired
    public ProductDedicatedServiceImpl(ProductDedicatedRepository productDedicatedRepository) {
        this.productDedicatedRepository = productDedicatedRepository;
    }

    @Override
    public List<ProductDedicated> getProductDedicated() {
        return (List<ProductDedicated>) productDedicatedRepository.findAll();
    }
}
