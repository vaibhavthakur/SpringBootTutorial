package com.javaminds.SpringBootTutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Department d1 = new Department(5L,"IT","Mumbai","T01");
        Department d2 = new Department(2L,"CO","Pune","T03");
        Department d3 = new Department(4L,"EX","Alibag","T05");
        Department d4 = new Department(3L,"EE","Vashi","T06");

        List<Department> l1 = new ArrayList<>();
        l1.add(d1);
        l1.add(d2);
        l1.add(d3);
        l1.add(d4);

        l1.sort(Comparator.comparing(department -> department.getDepartmentId()));

        System.out.println(l1);
        System.out.println(d1);





    }
}
