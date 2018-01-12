package com.draslarsesiri.draslarsesiri.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String productName;

    private String productCategory;

    @Lob
    private String productDescription;

    private double productPrice;

    private double productPriceDo;

    private boolean productOnAction;

    private int productDiscount;

    private boolean productNewCollection;

    private String productSeason;

    private String productMaterial;

    private boolean productExlusive;

    private String productManufacturer;

    private int productNumberOfImages;

    @JsonIgnore
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProductType productType;

    @JsonIgnore
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProductDedicated productDedicated;

    @Transient
    private MultipartFile[] productImages;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPriceDo() {
        return productPriceDo;
    }

    public void setProductPriceDo(double productPriceDo) {
        this.productPriceDo = productPriceDo;
    }

    public boolean isProductOnAction() {
        return productOnAction;
    }

    public void setProductOnAction(boolean productOnAction) {
        this.productOnAction = productOnAction;
    }

    public int getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }

    public boolean isProductNewCollection() {
        return productNewCollection;
    }

    public void setProductNewCollection(boolean productNewCollection) {
        this.productNewCollection = productNewCollection;
    }

    public String getProductSeason() {
        return productSeason;
    }

    public void setProductSeason(String productSeason) {
        this.productSeason = productSeason;
    }

    public boolean isProductExlusive() {
        return productExlusive;
    }

    public void setProductExlusive(boolean productExlusive) {
        this.productExlusive = productExlusive;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public int getProductNumberOfImages() {
        return productNumberOfImages;
    }

    public void setProductNumberOfImages(int productNumberOfImages) {
        this.productNumberOfImages = productNumberOfImages;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductDedicated getProductDedicated() {
        return productDedicated;
    }

    public void setProductDedicated(ProductDedicated productDedicated) {
        this.productDedicated = productDedicated;
    }

    public MultipartFile[] getProductImages() {
        return productImages;
    }

    public void setProductImages(MultipartFile[] productImages) {
        this.productImages = productImages;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }
}
