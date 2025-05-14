package com.devpb.productService.repository;

import com.devpb.productService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public class ProductRepository extends MongoRepository<Product, String> {

}
