package BankP;

public class Account {
    private String name;
    private int number;
    private String pin;

    public String getName() {
        return name;
    }

    public String getPin() {
        return this.pin;
    }

    private int balance;
    public Account(){

    }

  public Account(String name, int number, String pinNumber) {
      this.name = name;
      this.number = number;
      this.pin = pinNumber;
      if(pinNumber.length() > 4){
          throw new InvalidPinException("your pin is not correct");
      }
  }




  public void deposit(int amount) {
      if(amount <0)throw new InvalidAmountException("you can not deposit negative amount");
      balance += amount;
  }

  public int checkBalance(String pinNumber){
      if(this.pin ==pinNumber) {
          return balance;
      }
      throw  new InvalidPinException("you can not check");

 }


  public void withdraw(int amount,String pinNumber) {
       if (amount> balance)
           throw new InsufficientFundsException("you get money");
       if(!this.pin.equals(pinNumber))
           throw new InvalidPinException("Invalid pin number");
       if(amount <0)throw new InvalidAmountException("you can not deposit negative amount");
       balance -=amount;
  }

  public int getAccountNumber(){
       return number;
  }
  public String verifyPin(String pinNumber){
      if(pin.equals(pinNumber))
          return pin;
      else
          throw new InvalidPinException("your pin is not correct");
  }

}
