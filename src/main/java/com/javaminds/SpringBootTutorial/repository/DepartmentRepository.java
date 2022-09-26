package com.javaminds.SpringBootTutorial.repository;

import com.javaminds.SpringBootTutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public Department findByDepartmentName(String departmentName);
    @Query(value="select * from Department where UPPER(department_name) = UPPER(?1)",nativeQuery = true)
    public Department findByDepartmentNameIC(String departmentName);
}
