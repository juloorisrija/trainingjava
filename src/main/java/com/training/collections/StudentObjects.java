package com.training.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Student stu=new Student();
        List<Student> students = new ArrayList<>();
        students.add(new Student(11, 20, "Ram", "Sphn"));
        students.add(new Student(12, 21, "Raju", "CVR"));
        students.add(new Student(13, 23, "Ramya", "MVSR"));
        students.add(new Student(14, 20, "siri", "Sphn"));
        students.add(new Student(15, 25, "David", "Sphn"));
        students.add(new Student(16, 22, "john", "CVR"));
        List<Student> commonCollege = new ArrayList<>();
        System.out.println("enter the college name");
        String college = sc.next();
       for(Student student:students){
           if(student.getCollegeName().equalsIgnoreCase(college)){
               commonCollege.add(student);
           }
       }
       for (Student stu :commonCollege){
           System.out.println(stu);
       }

    }
}
