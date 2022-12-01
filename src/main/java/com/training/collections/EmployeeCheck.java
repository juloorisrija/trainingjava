package com.training.collections;

import com.training.java.IdAlreadyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeCheck {
    public static void main(String[] args) throws IdAlreadyException {
        String name;
        int id;
        double salary;
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("Ram",11,30000);
        Employee e2 = new Employee("Rani",12,31000);
        Employee e3 = new Employee("sri",13,25000);
        Employee e4 = new Employee("john",14,45000);
        Employee e5 = new Employee("anu",15,40000);
        List<Employee> employee = new ArrayList<>();
        List<Employee> employee1 = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
            System.out.println("enter the employee name");
            name= sc.next();
            System.out.println("enter the employee id");
            id =sc.nextInt();
            System.out.println("enter the employee salary");
            salary = sc.nextDouble();
            for(Employee employees:employee) {
                try {
                    if (employees.getEmpId() == id) {
                        throw new IdAlreadyException();
                    } else {
                        employee1.add(new Employee(name,id,salary));
                    }
                }
                catch (IdAlreadyException e){
                    System.out.println("Id already present");
                }
            }
            for(Employee emp : employee1){
                System.out.println(emp);
            }


    }
}
