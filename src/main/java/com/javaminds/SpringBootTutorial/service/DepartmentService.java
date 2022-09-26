package com.javaminds.SpringBootTutorial.service;

import com.javaminds.SpringBootTutorial.entity.Department;
import com.javaminds.SpringBootTutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public Department getDepartmentbyId(Long departmentId) throws DepartmentNotFoundException;

    public List<Department> fetchDepartmentList();

    public String deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

    public Department fetchDepartmentByNameIgnoreCase(String departmentName);
}
