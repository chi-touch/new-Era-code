package FireDrill;

import java.util.ArrayList;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String addContact;
    private ArrayList<Contact>  user = new ArrayList<>();

    int totalPhoneNumberCount;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
    }

    public Contact() {
    }
    Contact myContact = new Contact();

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }
    public String getFirstName() {

        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString(){
        return String.format("""
                First Name:%s
                Last Name:%s
                Phone Number:%s
                EmailAddress: +234 %s
                
                
                """,firstName,lastName,phoneNumber,emailAddress);
    }

   public Contact getAddContact(String firstName,String lastName, String phoneNumber,String emailAddress){
       Contact contact = new Contact(firstName,lastName,phoneNumber,emailAddress);
       totalPhoneNumberCount++;
       user.add(contact);
       return myContact;
   }

    public String getAddContact() {
        return addContact;
    }
}
