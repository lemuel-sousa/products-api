package com.limaodev.productapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.limaodev.productapi.entities.Department;
import com.limaodev.productapi.services.DepartmentService;

@RestController
@RequestMapping( value = "/departments")
public class DepartmentController {
    
    private DepartmentService departmentService;

    // [CREATE] new Department
    @PostMapping("/departments")
    @ResponseStatus(HttpStatus.CREATED)
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    // [GET] all Departments
    @GetMapping("/departments")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartments() {
        return departmentService.listAllDepartments();
    }

}
