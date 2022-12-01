package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollections {
    public static void main(String[] args){
        Employee e1 = new Employee("Ram",11,30000);
        Employee e2 = new Employee("Rani",12,31000);
        Employee e3 = new Employee("sri",13,25000);
        Employee e4 = new Employee("john",14,45000);
        Employee e5 = new Employee("anu",15,40000);
        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);

        Collections.sort(employee);
        for(Employee emp : employee) {
            System.out.println(emp);
        }
    }
}
