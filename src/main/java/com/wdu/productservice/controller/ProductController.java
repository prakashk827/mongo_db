package com.wdu.productservice.controller;

import com.wdu.productservice.dto.ProductRequest;
import com.wdu.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        System.out.println("Inside controller");
        productService.createProduct(productRequest);
    }
}
