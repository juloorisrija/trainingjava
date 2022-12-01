package org.example;

import java.util.Scanner;

public class Course {
    public static void main(String[] args){
       // FindCourse fc = new FindCourse();
        FindCourse fc5 = new FindCourse("Html",01,5000);
        FindCourse fc1 = new FindCourse("Java",02,3000);
        FindCourse fc2 = new FindCourse("python",03,7000);
        FindCourse fc3 = new FindCourse("c++",04,4000);
        FindCourse fc4 = new FindCourse(".net",05,3500);
        FindCourse[] fc = {fc5,fc1,fc2,fc3,fc4};
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the coursename");
        String coursename = sc.next();
        System.out.println("enter the courseid");
        int id =sc.nextInt();
        for(int i=0;i<5;i++) {
            if (coursename.equals(fc[i].getCourseName())){
                System.out.println("course is available and ");
            }
        }
    }
}
