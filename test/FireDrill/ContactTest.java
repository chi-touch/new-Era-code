package FireDrill;

import FireDrill.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest  {

    private Contact myContact;
    @BeforeEach
    public void initializePhoneBook() {

        myContact  = new Contact();
    }

    @Test
    public void testForFirstName(){
        myContact.setFirstName("chichi");

        assertEquals("chichi",myContact.getFirstName());
    }

    @Test
    public void testForLastName(){
        myContact.setLastName("david");

        assertEquals("david", myContact.getLastName());
    }

    @Test
    public void testForNumber(){
        myContact.setPhoneNumber("08103722570");
        assertEquals("08103722570",myContact.getPhoneNumber());
    }

    @Test
    public void testForEmailAddress(){
        myContact.setEmailAddress("chichi@gmail.com");
        assertEquals("chichi@gmail.com",myContact.getEmailAddress());
    }

    @Test
    public void testThatContactCanBeAdd(){
        myContact.setFirstName("chichi");
        myContact.setLastName("david");
        myContact.setPhoneNumber("08103722570");
        myContact.setEmailAddress("chichi@gmail.com");
        assertEquals("chichi,david,08103722570,chichi@gmail.com",myContact.getAddContact());
    }

}