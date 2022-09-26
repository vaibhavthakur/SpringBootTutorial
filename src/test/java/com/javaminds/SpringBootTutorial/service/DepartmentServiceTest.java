package com.javaminds.SpringBootTutorial.service;

import com.javaminds.SpringBootTutorial.entity.Department;
import com.javaminds.SpringBootTutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("IT")
                .departmentAddress("Mumbai")
                .departmentCode("IT07")
                .departmentId(1L)
                .build();

        Mockito.when(departmentService.fetchDepartmentByName("IT"))
                .thenReturn(department);

    }

    @Test
    @DisplayName("Test1 - Validate Department Name")
    @Disabled
    public void whenValidDeptNameThenDeptShouldFound(){

        String departmentName = "IT";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}