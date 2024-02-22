package ChichiSuperM;

public class Users {
    private String name;
    private int age;
    private String emailAddress;
    private  Addresses homeAddress;
    private  String passWord;

    public Users(String name, int age, String emailAddress, Addresses homeAddress, String passWord, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
    }

    private int phoneNumber;

}
