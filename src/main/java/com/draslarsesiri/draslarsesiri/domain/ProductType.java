package com.draslarsesiri.draslarsesiri.domain;

import javax.persistence.*;

@Entity
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodductTypeId;

    private String productTypeName;

    @OneToOne
    @JoinColumn(name="productId")
    private Product product;

    public int getProdductTypeId() {
        return prodductTypeId;
    }

    public void setProdductTypeId(int prodductTypeId) {
        this.prodductTypeId = prodductTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
