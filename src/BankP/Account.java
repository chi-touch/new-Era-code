package BankP;

public class Account {
    private String name;
    private int number;
    private String pin;
    private int balance;

  public Account(String name, int number, String pinNumber) {
      this.name = name;
      if(pinNumber.length() ==4 && pinNumber.matches("\\d+"))
          this.pin = pinNumber;
      this.number = number;
  }

    public Account() {

    }

    public void deposit(int amount) {
      if(amount <0)throw new InvalidAmountException();
      balance += amount;
    }

    public int checkBalance(String pinNumber){
      if(pin.equals(pinNumber)) return balance;
      else throw new InvalidPinException();
    }

   public void withdraw(int amount,String pinNumber) {
       if (amount> balance)
           throw new InsufficientFundsException();
       if(!this.pin.equals(pinNumber))
           throw new InvalidPinException();
       if(amount <0)throw new InvalidAmountException();
       balance -=amount;
  }

  public int getAccountNumber(){
      return number;
  }
  public boolean verifyPin(String pinNumber){
      return this.pin.equals(pinNumber);}

}
