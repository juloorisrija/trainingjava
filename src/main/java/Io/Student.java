package Io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    public static void main(String []args) throws IOException, ParseException {
        String file = "";
        int i=0;
        String[] student=null;
        StudentInfo[] stuList = new StudentInfo[3];
        BufferedReader br = new BufferedReader(new FileReader("csv.file"));
        while((file=br.readLine())!=null){
             student=file.split(",");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the date of joining of "+student[i]);
            String doj = sc.next();
            SimpleDateFormat format= new SimpleDateFormat("YYYY-MM-DD");
            Date date=format.parse(doj);
            System.out.println("convert the date to DD-MM-YYYY ");
             stuList[i]=new StudentInfo(Integer.parseInt(student[0]),student[1],student[2]);
             i++;

/*            System.out.println("Student[candidateId] "+student[0]+",[candidateName] "+student[1]+
                    ",[courseEnrolledIn] " +student[2]);*/

        }
        for(int j=0;j<3;j++){
            System.out.println(stuList[j]);
        }
    }

}
