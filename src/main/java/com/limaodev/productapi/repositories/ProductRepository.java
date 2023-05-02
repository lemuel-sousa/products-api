package com.limaodev.productapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaodev.productapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
