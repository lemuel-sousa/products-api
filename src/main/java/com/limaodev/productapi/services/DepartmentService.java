package com.limaodev.productapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.limaodev.productapi.entities.Department;
import com.limaodev.productapi.repositories.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentService {
    
    private DepartmentRepository departmentRepository;

    //Create new Department
    public Department createDepartment( Department department){
        return departmentRepository.save(department);
    }

    //List all Departments
    public List<Department> listAllDepartments(){
        return departmentRepository.findAll();
    }


}
