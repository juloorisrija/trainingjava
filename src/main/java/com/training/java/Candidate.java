package com.training.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class Candidate extends InvalidSalaryException {
      void Salary(double salary) throws InvalidSalaryException {
        try {
            if (salary <= 10000) {
                throw new InvalidSalaryException();
                // System.out.println("Salary can not be less than 10000");
            }
        }
        catch(InvalidSalaryException e){
            System.out.println("Salary can not be less than 10000");
        }


    }
    public static void main(String[] args) {
        String name;
        char gender;
        double salary;
        Candidate c=new Candidate();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the name");
            name = sc.next();
            boolean result= name.matches("^[a-zA_Z]*$");
            if(!(result==true)){
                throw new InputMismatchException();
            }
            System.out.println("enter the gender");
            gender = sc.next().charAt(0);
            if (!(gender == 'M' || gender == 'F')) {
                throw new InputMismatchException("input invalid exception");
            }
            System.out.println("enter the salary");
            salary = sc.nextDouble();
                c.Salary(salary);

        } catch (InputMismatchException e) {
            System.out.println("invalid name format");
        }
        catch (InvalidSalaryException e){
            System.out.println(e);
        }


    }

}
