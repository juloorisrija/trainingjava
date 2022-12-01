package org.example;

public class Account implements Cloneable {
    private double accountNumber, balance;
    private String accountName;

    public Account(double accountNumber, double balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    void withdraw(int amount){
        balance = balance-amount;
    }
    void deposit(int amount){
        balance = balance+amount;
    }
    public String toString() {
        return accountNumber + " " + balance + " " +accountName;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
