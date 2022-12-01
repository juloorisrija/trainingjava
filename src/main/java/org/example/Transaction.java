package org.example;

public class Transaction {
    public static void main(String[] args){
        Account a1= new Account(103345,30000,"rani");
        a1.withdraw(200);
        Account a2=null;
        Account a3=null;
        try {
            a2=(Account)a1.clone();
            a2.deposit(2000);
            System.out.println("Nov20Transaction is : "+a1);
            System.out.println("Nov21Transaction is :"+a2);
            a3=(Account)a2.clone();
            a3.withdraw(3000);
            System.out.println("Nov22Transaction is:"+a3);

           // throw new CloneNotSupportedException();
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println("Nov21Transaction is :"+a2);
    }
}
