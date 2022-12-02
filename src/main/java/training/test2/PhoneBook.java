package training.test2;

public class PhoneBook implements Comparable<PhoneBook> {
    private String contactName;
    private Long contactNumber;
    private String address;

    public PhoneBook() {

    }

    public PhoneBook(String contactName, Long contactNumber, String address) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "ContactName='" + contactName + '\'' +
                ", ContactNumber=" + contactNumber +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(PhoneBook o) {
        if(this.contactNumber>o.contactNumber){
            return 1;
        } else if (this.contactNumber<o.contactNumber) {
            return -1;
        }else{
            return 0;
        }
    }
}
