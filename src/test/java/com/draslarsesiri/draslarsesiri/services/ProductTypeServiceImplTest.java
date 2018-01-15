package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.ProductType;
import com.draslarsesiri.draslarsesiri.repositories.ProductTypeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ProductTypeServiceImplTest {

    ProductTypeServiceImpl productTypeService;

    @Mock
    ProductTypeRepository productTypeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        productTypeService = new ProductTypeServiceImpl(productTypeRepository);
    }

    @Test
    public void getProductType() throws Exception{
        List<ProductType> productTypes = new ArrayList<ProductType>();
        productTypes.add(new ProductType());
        productTypes.add(new ProductType());

        when(productTypeRepository.findAll()).thenReturn(productTypes);

        List<ProductType> productTypeList = productTypeService.getProductType();

        assertEquals(productTypeList.size(), 2);
        verify(productTypeRepository, times(1)).findAll();
    }
}