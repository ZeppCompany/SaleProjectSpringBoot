package com.draslarsesiri.draslarsesiri.controllers;

import com.draslarsesiri.draslarsesiri.domain.Product;
import com.draslarsesiri.draslarsesiri.services.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class ProductControllerTest {

    ProductController productController;

    @Mock
    ProductService productService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        productController = new ProductController(productService);
    }

    @Test
    public void productlist() {
    }

    @Test
    public void getProductById() throws Exception{
        Product product = new Product();
        product.setProductId(1);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(productController).build();

        when(productService.findById(anyInt())).thenReturn(product);

        mockMvc.perform(get("/product/show/1")).andExpect(status().isOk()).andExpect(view().name("product/showproduct"));
    }
}