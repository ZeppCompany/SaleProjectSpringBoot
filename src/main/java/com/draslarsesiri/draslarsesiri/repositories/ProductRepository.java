package com.draslarsesiri.draslarsesiri.repositories;

import com.draslarsesiri.draslarsesiri.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product, Integer>{
}
