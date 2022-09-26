package com.javaminds.SpringBootTutorial.repository;

import com.javaminds.SpringBootTutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .departmentCode("006")
                .departmentAddress("Pune")
                .departmentName("Mechanical")
                .build();

        entityManager.persist(department);

    }

    @Test
    public void whenFindByIdThenReturnDepartment() {
        Department department = departmentRepository.findById(1L).get();

        assertEquals("Mechanical",department.getDepartmentName());
    }


}