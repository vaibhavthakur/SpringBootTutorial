package com.javaminds.SpringBootTutorial.controller;

import com.javaminds.SpringBootTutorial.entity.Department;
import com.javaminds.SpringBootTutorial.error.DepartmentNotFoundException;
import com.javaminds.SpringBootTutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {

        LOGGER.info("Inside saveDepartment() of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentbyId(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

        LOGGER.info("Inside getDepartmentbyId() of DepartmentController");
        return departmentService.getDepartmentbyId(departmentId);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId,department);
    }
    @GetMapping("/departments/{name}")
    public Department fetchDepartmentByName(@PathVariable("name")String departmentName) {
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }

}
