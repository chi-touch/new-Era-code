package BankP;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;


    private List<Account> accounts = new ArrayList<>();
    private int accountNumber;
    private int number =0;

    public Bank(){

    }



    public Bank(String name){
        this.name = name;
    }

    public int countAccount(){
        return accounts.size();
    }


    public Account registerCustomer(String firstName,String surName, String pin) {
        String fullName = firstName + " " + surName;
        Account account = new Account(fullName,accounts.size()+1,pin);
        accounts.add(account);
        this.accountNumber = accountNumber;
        return account;
    }

    private int generateAccount(){
       return number+=1;
    }

    public int getAccounts() {

        return accounts.size();
    }

    public void deposit(int accountNumber, int amount) {
        Account myAccount = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                 myAccount = accounts.get(i);
            }
        }
//        Account myAccount = findAccount(accountNumber);
        if (myAccount == null) throw new InvalidAccountException("Invalid account number: " + accountNumber);
        myAccount.deposit(amount);
        if (amount < 0){
            throw new InvalidAmountException("Can not deposit a negative amount");
        }

    }

    public int checkBalance(int accountNumber,String pin) {
        Account myAccount = findAccount(accountNumber);
            return myAccount.checkBalance(pin);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account myAccount = findAccount(accountNumber);
            myAccount.withdraw(amount,pin);
        if(amount <0){
            throw new InvalidAmountException("Can not withdraw a negative amount");
        }

    }

    public void transfer(int senderAccountNumber,int receiverAccountNumber,int amount,String senderPin){
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdraw(amount,senderPin);
        receiverAccount.deposit(amount);
    }


    public Account findAccount(int accountNumber) {
        Account foundAccount = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber){
                foundAccount = accounts.get(i);
                return foundAccount;
            }
        }
        throw new InvalidAccountException("Account with this account number does not exist");

    }

//public Account findAccountZ(int accountNumber){
//        Account foundAccount = new Account();
//    for (int i = 0; i < accounts.size(); i++) {
//        if (accounts.get(i).getAccountNumber() == accountNumber){
//            foundAccount = accounts.get(i);
//
//        }
//    }
//    if (foundAccount == null) throw new InvalidAccountException("Account with this account number does not exist");
//return foundAccount;
//    }
    public void removeAccount(int accountNumber,String pin){
        Account foundAccount = findAccount(accountNumber);
      if (foundAccount.getPin().equalsIgnoreCase(pin)) {
          accounts.remove(foundAccount);
      }else {
          throw new InvalidPinException("you entered a wrong password");
      }

    }

}


