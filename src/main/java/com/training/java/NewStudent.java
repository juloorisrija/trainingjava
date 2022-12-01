package com.training.java;

import java.util.Scanner;

public class NewStudent extends IdAlreadyException {
    public static void main(String[] arg) {
        Student s1 = new Student("sri", 11, 'A');
        Student s2 = new Student("john", 12, 'B');
        Student s3 = new Student("david", 13, 'A');
        Student s4 = new Student("ram", 14, 'c');
        Student stu[] = {s1, s2, s3, s4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();
        System.out.println("enter the id");
        int id = sc.nextInt();
        System.out.println("enter the grade");
        char grade = sc.next().charAt(0);
        Student s = new Student(name, id, grade);
        try {
            for (int i = 0; i < 5; i++) {
                if (id == stu[i].id) {
                    throw new IdAlreadyException();
                }
            }
        } catch (IdAlreadyException e) {
            System.out.println("USERID ALREADY EXIST");
        }
    }
}
