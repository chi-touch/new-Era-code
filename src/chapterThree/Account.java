package chapterThree;

public class Account {
    private String name;
    private String number;
    private int balance;

    public Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }
    public Account(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
