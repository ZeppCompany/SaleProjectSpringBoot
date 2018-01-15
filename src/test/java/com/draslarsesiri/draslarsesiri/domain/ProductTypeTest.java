package com.draslarsesiri.draslarsesiri.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTypeTest {

    ProductType productType;

    @Before
    public void setUp() throws Exception {
        productType = new ProductType();
    }

    @Test
    public void getProductTypeId() {
        int productTypeId = 4;
        productType.setProductTypeId(productTypeId);

        assertEquals(productTypeId , productType.getProductTypeId());
    }

    @Test
    public void getProductTypeName() {
        String name = "Superiška";
        productType.setProductTypeName(name);
        assertEquals("Superiška", productType.getProductTypeName());
    }

    @Test
    public void getProduct() {
        Product product = new Product();
        Product product1 = new Product();
        productType.setProduct(product);
        assertEquals(product, productType.getProduct());
    }
}