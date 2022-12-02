package training.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Contact {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        List<PhoneBook> contact=new ArrayList<>();
        List<PhoneBook> contact1=new ArrayList<>();
        contact.add(new PhoneBook("ram",9024356734L,"Ap"));
        contact.add(new PhoneBook("sri",8025676734L,"TS"));
        contact.add(new PhoneBook("anu",7024356734L,"UP"));
        contact.add(new PhoneBook("sonu",6024356734L,"TN"));
        contact.set(2,(new PhoneBook("raju",545476L,"Delhi")));//updating the 2nd row
       // contact.set(2,PhoneBook.setContactName("Raju")));
        contact.remove(3);            //deleting the contact based on index value
        for(PhoneBook pb:contact){          //viewing the all contacts
            System.out.println(pb);
        }
        System.out.println("Enter the contact number need to be view");
        Long number = sc.nextLong();
        boolean flag = false;
        for(PhoneBook pb1:contact) {            //searching for the contact based on the user entered number
            if (pb1.getContactNumber().equals(number)) {
                //System.out.println(pb1);

                contact1.add(new PhoneBook(pb1.getContactName(), pb1.getContactNumber(), pb1.getAddress()));
                flag = true;
            }
        }
            if (flag) {
                System.out.println(contact1);
            }


    }
}
