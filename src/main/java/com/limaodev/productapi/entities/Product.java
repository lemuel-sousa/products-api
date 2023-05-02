package com.limaodev.productapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "products")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column( nullable = false)
    private String name;

    @Column( nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn( name = "department_id")
    private Department department;


}
