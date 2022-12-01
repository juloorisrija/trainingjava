package com.training.collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        int sum=0;
        for(int num:numbers) {
            if ((num % 2) != 0) {
                sum = sum + num;
            }
        }
                System.out.println("total sum of odd numbers in the list is: "+sum);

        List <String> names=new ArrayList<>();
        names.add("srija");
        names.add("siri");
        names.add("Ram");
        names.add("srini");
        names.add("raju");
        names.add(3,"sai");
        for(String name:names){
            if(name.startsWith("s")){
                System.out.println(name);
            }
        }

       /* Iterator it = numbers.iterator();
        while(it.hasNext()){
         System.out.println(it.next());
        }

    }*/
    }
}
