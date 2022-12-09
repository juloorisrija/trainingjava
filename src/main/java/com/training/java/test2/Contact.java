package com.training.java.test2;

import java.util.Scanner;

public class Contact {
    public static void main(String[] args){
        ContactCheck contactCheck=new ContactCheck();
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("enter the choice : if choice is 1.add to list, 2.delete from the list, 3.update the list," +
                    " 4. view all the contact list, 5.view the contact base on use contact number 9.quit the program");
            System.out.println("enter the choice");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("enter the name");
                String name = sc.next();
                System.out.println("enter the number");
                Long number = sc.nextLong();
                System.out.println("enter the address");
                String address = sc.next();
                PhoneBook contact = new PhoneBook(name, number, address);
                contactCheck.addContact(contact);
            } else if (choice == 2) {
                System.out.println("enter the name that you want to delete from the phonebook");
                Long number = sc.nextLong();
                PhoneBook contact = contactCheck.getMember(number);
                System.out.println(contact);
                System.out.println("contact removed successfully");
            }//deleting the contact based on index value
            else if (choice == 3) {
                System.out.println("enter the name that you want to update");
                String name = sc.next();
                System.out.println("enter the updated number");
                Long number = sc.nextLong();
                System.out.println("enter the updated address");
                String address = sc.next();
                PhoneBook update = contactCheck.updateContact(name, number, address);
                System.out.println(update);
                System.out.println("successfully updated");
            } else if (choice == 4) {
                contactCheck.viewContact();
            } else if (choice == 5) {
                System.out.println("Enter the contact number need to be view");
                Long number = sc.nextLong();
                contactCheck.viewContactOnId(number);
            } else if (choice==9) {
                break;
            } else {
                choice = 1;
            }
        }

    }
}
