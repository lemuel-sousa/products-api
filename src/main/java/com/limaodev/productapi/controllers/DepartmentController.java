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

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping( value = "/departments")
@AllArgsConstructor
@Slf4j
public class DepartmentController {
    
    private DepartmentService departmentService;

    // [CREATE] new Department
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Department createDepartment(@RequestBody Department department) {
        log.info("Creating new department: [{}]", department);
        return departmentService.createDepartment(department);
    }

    // [GET] all Departments
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartments() {
        log.info("Linsting all departments");
        return departmentService.listAllDepartments();
    }

}
