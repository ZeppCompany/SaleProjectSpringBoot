package com.draslarsesiri.draslarsesiri.services;

import com.draslarsesiri.draslarsesiri.domain.Product;
import com.draslarsesiri.draslarsesiri.repositories.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ProductServiceImplTest {

    ProductServiceImpl productServiceImpl;

    @Mock
    ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        productServiceImpl = new ProductServiceImpl(productRepository);
        }

    @Test
    public void getProduct() throws Exception{
        Product product = new Product();
        Product product1 = new Product();
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        when(productRepository.findAll()).thenReturn(productList);

        List<Product> productFromService = productServiceImpl.getProduct();
        assertEquals(productFromService.size(), 2);
        verify(productRepository, times(1)).findAll();
    }

    @Test
    public void findById() {
        Product product = new Product();
        product.setProductId(1);

        Optional<Product> productOptional = Optional.of(product);

        when(productRepository.findById(anyInt())).thenReturn(productOptional);

        Product productReturned = productServiceImpl.findById(1);

        assertEquals(1, productReturned.getProductId());
        assertNotNull("Null product returned", productReturned);
        verify(productRepository, times(1)).findById(anyInt());
        verify(productRepository, times(0)).findAll();
    }
}