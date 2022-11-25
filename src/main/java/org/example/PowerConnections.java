package org.example;

import java.util.Scanner;

public class PowerConnections {
    public double electicBill(int units,String type) {
        int totalAmount;
        if (type.equalsIgnoreCase("domestic")) {
            totalAmount = units * 5;
            if (totalAmount <= 1000) {
                totalAmount = totalAmount / 2;
            }
            totalAmount = totalAmount + 250;
           // System.out.println("total electic bill is: " + totalAmount);
        }
       else{
           totalAmount = (units*8)+500;
           if(totalAmount<=8500){
               totalAmount=totalAmount-((totalAmount*10)/100);
           }
        }
    return totalAmount;


}
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the units");
    int u=s.nextInt();
    System.out.println("enter the connection type");
    String ct = s.next();
    PowerConnections pc = new PowerConnections();
    System.out.println(pc.electicBill(u,ct));
}
}

