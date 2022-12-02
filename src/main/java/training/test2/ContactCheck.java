package training.test2;

import java.util.ArrayList;
import java.util.List;

public class ContactCheck {
       List<PhoneBook> contact =new ArrayList<>();
       List<PhoneBook> contact1 =new ArrayList<>();
       PhoneBook phoneBook=new PhoneBook();

       public List<PhoneBook> getContact() {
              return contact;
       }

       public void setContact(List<PhoneBook> contact) {
              this.contact = contact;
       }
       public void addContact(PhoneBook phonebook){
              contact.add(phonebook);
       }
       public void deleteContact(PhoneBook phonebook){
              contact.remove(phonebook);
       }

       public PhoneBook updateContact(String name,Long num,String address){
              boolean flag = false;
              for(PhoneBook pb:contact) {
                     if(pb.getContactName()==name){
                        pb.setContactNumber(num);
                        pb.setAddress(address);
                        phoneBook=pb;
                        flag=true;
                     }
              }
              if(flag){
                     return phoneBook;
              }
              else{
                     return null;
              }

             // contact.add(phoneBook);
       }
       public PhoneBook getMember(Long num){
              boolean flag=false;

              for(PhoneBook pb:contact){
                     if(pb.getContactNumber()==num){
                            phoneBook=pb;
                            flag=true;
                     }
              }
              if(flag){
                     return phoneBook;
              }
              else{
                     return null;
              }
       }
       public void viewContact(){
              for(PhoneBook pb: contact){
                     System.out.println(pb);
              }
       }
       public void viewContactOnId(Long num ){
              boolean flag = false;
              for (PhoneBook pb1 : contact) {            //searching for the contact based on the user entered number
                     if (pb1.getContactNumber().equals(num)) {
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
