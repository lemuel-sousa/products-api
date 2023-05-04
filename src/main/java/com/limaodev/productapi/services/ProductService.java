package com.limaodev.productapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.limaodev.productapi.entities.Product;
import com.limaodev.productapi.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
    
    private ProductRepository productRepository;

    //Create new product
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    //List all registered products
    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }


}
