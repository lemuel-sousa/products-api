package com.limaodev.productapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaodev.productapi.entities.Department;

public interface DepartmentRepository extends JpaRepository< Department, Long>{
    
}
