package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.ProductType;
import com.draslarsesiri.draslarsesiri.repositories.ProductTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductTypeServiceImpl implements ProductTypeService{

    private ProductTypeRepository productTypeRepository;

    @Autowired
    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public List<ProductType> getProductType() {
        return (List<ProductType>) productTypeRepository.findAll();
    }
}
