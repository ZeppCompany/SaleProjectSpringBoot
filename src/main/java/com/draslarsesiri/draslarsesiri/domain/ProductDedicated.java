package com.draslarsesiri.draslarsesiri.domain;

import javax.persistence.*;

@Entity
public class ProductDedicated {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productDedicatedId;

    private String productDedicatedName;

    @OneToOne(mappedBy = "productDedicated")
    private Product product;

    public int getProductDedicatedId() {
        return productDedicatedId;
    }

    public void setProductDedicatedId(int productDedicatedId) {
        this.productDedicatedId = productDedicatedId;
    }

    public String getProductDedicatedName() {
        return productDedicatedName;
    }

    public void setProductDedicatedName(String productDedicatedName) {
        this.productDedicatedName = productDedicatedName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
