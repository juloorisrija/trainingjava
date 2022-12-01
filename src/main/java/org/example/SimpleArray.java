package org.example;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String namesGrade[][] = new String[5][2];
        for(int j=0;j<5;j++) {
            for (int i = 0; i < 2; i++) {
               namesGrade[j][i] = sc.next();
            }
        }
       for(int i=0;i<5;i++) {

               String grade=namesGrade[i][1].toString();
               if (grade == "A") {

                   System.out.println(namesGrade[i][0]);
               }

       }

    }
}
