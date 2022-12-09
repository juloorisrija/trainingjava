package javainterface;

import com.training.collections.StudentInfo;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamFunction {
    public static void main(String[] args){
        /*
        List<String> list = new ArrayList<>();
        list.add("Sri");
        list.add("Ram");
        list.add("john");
        list.add("sai");
        Stream<String> nameStream = list.stream();
        List<String> newList = nameStream.filter(x->x.startsWith("s")||x.startsWith("S")).map(x->x+" Moris").sorted().collect(Collectors.toList());
        System.out.println(newList);*/
        List<StudentInfo> students = new ArrayList<>();
        students.add(new StudentInfo(101,"srija",'A'));
        students.add(new StudentInfo(101,"sai",'B'));
        students.add(new StudentInfo(101,"anu",'A'));
        Stream<StudentInfo> name= students.stream();
        List<StudentInfo> newStudent = name.filter(a->a.getGrade()=='A').collect(Collectors.toList());
        System.out.println(newStudent);
    }

}
