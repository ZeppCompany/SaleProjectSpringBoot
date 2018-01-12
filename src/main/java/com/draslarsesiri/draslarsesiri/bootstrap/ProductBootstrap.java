package com.draslarsesiri.draslarsesiri.bootstrap;

import com.draslarsesiri.draslarsesiri.domain.Product;
import com.draslarsesiri.draslarsesiri.domain.ProductDedicated;
import com.draslarsesiri.draslarsesiri.domain.ProductType;
import com.draslarsesiri.draslarsesiri.repositories.ProductDedicatedRepository;
import com.draslarsesiri.draslarsesiri.repositories.ProductRepository;
import com.draslarsesiri.draslarsesiri.repositories.ProductTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class ProductBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;
    private ProductTypeRepository productTypeRepository;
    private ProductDedicatedRepository productDedicatedRepository;

    @Autowired
    public ProductBootstrap(ProductRepository productRepository, ProductTypeRepository productTypeRepository, ProductDedicatedRepository productDedicatedRepository) {
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.productDedicatedRepository = productDedicatedRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        productRepository.saveAll(getProduct());
    }

    private List<Product> getProduct(){
        List<Product> productList = new ArrayList<>();

        Product sesir = new Product();
        ProductDedicated productDedicated = new ProductDedicated();
        productDedicated.setProductDedicatedName("Lovački");
        productDedicated.setProduct(sesir);
        productDedicatedRepository.save(productDedicated);

        ProductType productType = new ProductType();
        productType.setProductTypeName("šešir");
        productType.setProduct(sesir);
        productTypeRepository.save(productType);

        sesir.setProductName("Žirado");
        sesir.setProductCategory("muški");
        sesir.setProductDescription("Superiška bla, bla, bla, bla, bla, bla, bla!");
        sesir.setProductExlusive(false);
        sesir.setProductManufacturer("Aleksandar Draslar");
        sesir.setProductNewCollection(false);
        sesir.setProductOnAction(false);
        sesir.setProductPrice(1990);
        sesir.setProductPriceDo(2590);
        sesir.setProductMaterial("Zečija dlaka");
        sesir.setProductSeason("Letnja Sezona");

        productList.add(sesir);

        Product kapa = new Product();
        ProductDedicated productDedicated1 = new ProductDedicated();
        productDedicated1.setProductDedicatedName("Irska");
        productDedicated1.setProduct(kapa);
        productDedicatedRepository.save(productDedicated1);

        ProductType productType1 = new ProductType();
        productType1.setProductTypeName("šešir");
        productType1.setProduct(kapa);
        productTypeRepository.save(productType1);

        kapa.setProductName("Irski Bećarac");
        kapa.setProductCategory("muški");
        kapa.setProductDescription("Superiška kačket za bitange!");
        kapa.setProductExlusive(true);
        kapa.setProductManufacturer("Aleksandar Draslar");
        kapa.setProductNewCollection(true);
        kapa.setProductOnAction(true);
        kapa.setProductPrice(3250);
        kapa.setProductPriceDo(4780);
        kapa.setProductMaterial("Somot, Krzno, Lan");
        kapa.setProductSeason("Zimska Sezona");

        productList.add(kapa);


        Product zenski = new Product();
        ProductDedicated productDedicated2 = new ProductDedicated();
        productDedicated2.setProductDedicatedName("Moda Ženska");
        productDedicated2.setProduct(zenski);
        productDedicatedRepository.save(productDedicated2);

        ProductType productType2 = new ProductType();
        productType2.setProductTypeName("šešir");
        productType2.setProduct(zenski);
        productTypeRepository.save(productType2);

        zenski.setProductName("Modni Milano");
        zenski.setProductCategory("ženski");
        zenski.setProductDescription("Za dame, kojima je stalo do stila");
        zenski.setProductExlusive(true);
        zenski.setProductManufacturer("Aleksandar Draslar");
        zenski.setProductNewCollection(true);
        zenski.setProductOnAction(false);
        zenski.setProductPrice(6899);
        zenski.setProductPriceDo(9299);
        zenski.setProductMaterial("Keper, filc");
        zenski.setProductSeason("Zimska Sezona");

        productList.add(zenski);

        return productList;
    }
}
