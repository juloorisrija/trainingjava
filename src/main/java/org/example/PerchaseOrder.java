package org.example;
import java.util.Scanner;
public class PerchaseOrder {
   public void inductionHeater(int quantity,String itemName){
       int cost=0;
        if(quantity>50) {
            cost = quantity * 850;
            System.out.println("inductionHeater : "+cost);
        }else if(quantity>30 && quantity<50) {
           cost = quantity * 900;
            System.out.println("inductionHeater : "+cost);
       }
       else{
           cost=quantity*950;
            System.out.println("inductionHeater : "+cost);
        }
    }
    public void electricKettin(int quantity,String itemName){
        int cost1=0;
        if(quantity>50) {
            cost1 = quantity * 700;
            System.out.println("electricKettin : "+cost1);
        }else if(quantity>30 && quantity<50) {
            cost1 = quantity * 800;
            System.out.println("electricKettin : "+cost1);
        }
        else{
            cost1=quantity*900;
            System.out.println("electricKettin : "+cost1);
        }
    }

    public static void main(String []args){
       PerchaseOrder p =new PerchaseOrder();
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the inductionHeater quantity and item name");
       int q=sc.nextInt();
       String in = sc.next();
       p.inductionHeater(q,in);
       p.electricKettin(5,"prestige");


    }

        }