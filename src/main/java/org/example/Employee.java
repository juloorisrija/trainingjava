package org.example;

public class Employee {
    String employeeName;
    int empId,empAge;

    public Employee(String employeeName, int empId, int empAge) {
        this.employeeName = employeeName;
        this.empId = empId;
        this.empAge = empAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
