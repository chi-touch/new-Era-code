
package BankP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;
    private Account account;

    @BeforeEach
    public void initailizeBank(){
        bank = new Bank("FCMB");
    }

    @Test
    public void registerCustomerTest(){
        Account account = bank.registerCustomer("chichi","glo","2222",1234567890);
        assertEquals(1,bank.getAccounts());
    }

    @Test
    public void testThatMoreCustomerCanBeRegistered(){
        bank.registerCustomer("chichi","glo","2222",1267394620);
        bank.registerCustomer("dayo","akin","0000",1023674863);
        assertEquals(2,bank.getAccounts());
    }

    @Test
    public void testForDeposit(){
        Account account= bank.registerCustomer("chichi","glo","2222",1234567890);
        bank.deposit(1234567890,1000);
        assertEquals(1000,bank.checkBalance(1234567890,"2222"));
    }

    @Test
    public void testThatTwoAccountCanBeDeposited(){
        Account account= bank.registerCustomer("chichi","glo","2222",1234567890);
        bank.deposit(1234567890,1000);
        assertEquals(1000,bank.checkBalance(1234567890,"2222"));
        Account account1= bank.registerCustomer("josh","chis","1234",1234567889);
        bank.deposit(1234567889,2000);
        assertEquals(2000, bank.checkBalance(1234567889,"1234"));

    }

    @Test
    public void testForWithdraw(){
        bank.registerCustomer("chichi","glo","0000",350685601);
        bank.deposit(350685601,20000);
        assertEquals(20000, bank.checkBalance(350685601, "0000"));
        bank.withdraw(350685601,15000,"0000");
        assertEquals(5000,bank.checkBalance(350685601,"0000"));

    }

    @Test
    public void testForTransfer(){
        bank.registerCustomer("chichi","glo","2222",1212332433);
        bank.deposit(1212332433,50000);
        bank.registerCustomer("hannah","chib","0000",1203182638);
        bank.transfer(1212332433,1203182638,30000,"2222");

        assertEquals(20000,bank.checkBalance(1212332433,"2222"));
       // System.out.println(bank.checkBalance(350685601,"2222"));



    }

    @Test
    public void testToFindAccount(){
       Account account = bank.registerCustomer("josh","chisom","2222",1234567892);

        assertEquals(account, bank.findAccount(account.getAccountNumber()));

    }

    @Test
    public void testBankThrowsExceptionForInvalidAccountNumber(){
        Account account = bank.registerCustomer("josh","chisom","2222",1234567892);

        assertThrows(InvalidAccountException.class, () -> bank.findAccount(456787656));

    }

}
