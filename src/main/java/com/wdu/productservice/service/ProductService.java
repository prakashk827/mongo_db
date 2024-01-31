package com.wdu.productservice.service;

import com.wdu.productservice.dto.ProductRequest;
import com.wdu.productservice.model.Product;
import com.wdu.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());

        Product res = productRepository.save(product);
        System.out.println("Response");
        System.out.println(res);
    }
}
