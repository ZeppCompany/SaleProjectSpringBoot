package com.draslarsesiri.draslarsesiri.controllers;

import com.draslarsesiri.draslarsesiri.domain.Product;
import com.draslarsesiri.draslarsesiri.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/productlist")
    public String productlist(Model model){
        List<Product> products = productService.getProduct();
        model.addAttribute("products", products);
        return "product/productlist";
    }

    @RequestMapping("/product/show/{productId}")
    public String getProductById(@PathVariable int productId, Model model){
        model.addAttribute("product", productService.findById(productId));
        return "/product/showproduct";
    }
}
