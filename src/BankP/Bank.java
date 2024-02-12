package BankP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();
    private int accountNumber;

    public Bank(String name){
        this.name = name;
    }


    public Account registerCustomer(String firstName,String surName, String pin,int accountNumber) {
        String fullName = firstName + " " + surName;
        Account account = new Account(fullName,accountNumber,pin);
        accounts.add(account);
        this.accountNumber = accountNumber;
        return account;
    }

    public int getAccounts() {
        return accounts.size();
    }

    public void deposit(int accountNumber, int amount) {
        Account myAccount = findAccount(accountNumber);
        myAccount.deposit(amount);

    }

    public int checkBalance(int accountNumber,String pin) {
        Account myAccount = findAccount(accountNumber);
            return myAccount.checkBalance(pin);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account myAccount = findAccount(accountNumber);
            myAccount.withdraw(amount,pin);

    }

    public void transfer(int senderAccountNumber,int receiverAccountNumber,int amount,String senderPin){
        withdraw(senderAccountNumber, amount, senderPin);
        deposit(receiverAccountNumber, amount);


    }


    public Account findAccount(int accountNumber) {
        for (int index = 0; index < accounts.size(); index++) {
            Account myAccount = accounts.get(index);
            if (myAccount.getAccountNumber() == accountNumber)return myAccount;
        }
        throw new InvalidAccountException("Account with this account number does not exist");

    }
}


