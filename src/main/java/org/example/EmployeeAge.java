package org.example;

public class EmployeeAge {
    public static void main(String[] args){
        Employee e1= new Employee("john",121,25);
        Employee e2= new Employee("siri",131,35);
        Employee e3= new Employee("anu",141,55);
        Employee e4= new Employee("shiva",151,30);
        Employee e5= new Employee("lakshmi",161,47);
        Employee[] employee ={e1,e2,e3,e4,e5};
        int age=0,empAge[]=new int[5];
        for(int i=0;i<5;i++){
             empAge[i] = employee[i].getEmpAge();
               age = empAge[i]+age;

        }
        int avgEmpAge=age/ employee.length;
        System.out.println(avgEmpAge);
    }
}
