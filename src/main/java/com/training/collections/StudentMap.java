package com.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args){
        List<StudentInfo> list=new ArrayList<>();
        list.add(new StudentInfo(101,"anu",'A'));
        Map<Character,List<StudentInfo>> mapset = new HashMap<>();
        for(Map.Entry<Character,List<StudentInfo>>  entry: mapset.entrySet()){

        }
    }
}
