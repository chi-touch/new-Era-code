
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
        Account account = bank.registerCustomer("chichi","glo","2222");
        assertEquals(1,bank.getAccounts());
    }

    @Test
    public void testThatMoreCustomerCanBeRegistered(){
        bank.registerCustomer("chichi","glo","2222");
        bank.registerCustomer("dayo","akin","0000");
        assertEquals(2,bank.getAccounts());
    }

    @Test
    public void testForDeposit(){
        Account account= bank.registerCustomer("chichi","glo","2222");

        bank.deposit(1,1000);
        assertEquals(1000,bank.checkBalance(1,"2222"));
    }

    @Test
    public void testThatTwoAccountCanBeDeposited(){
        Account account= bank.registerCustomer("chichi","glo","2222");
        bank.deposit(1,1000);
        assertEquals(1000,bank.checkBalance(1,"2222"));
        Account account1= bank.registerCustomer("josh","chis","1234");
        bank.deposit(2,2000);
        assertEquals(2000, bank.checkBalance(2,"1234"));

    }

    @Test
    public void testForWithdraw(){
        bank.registerCustomer("chichi","glo","0000");
        bank.deposit(1,20000);
        assertEquals(20000, bank.checkBalance(1, "0000"));
        bank.withdraw(1,15000,"0000");
        assertEquals(5000,bank.checkBalance(1,"0000"));

    }

    @Test
    public void testForTransfer(){
        bank.registerCustomer("chichi","glo","2222");
        bank.deposit(1,50000);
        bank.registerCustomer("hannah","chib","0000");
        bank.transfer(1,2,30000,"2222");

        assertEquals(20000,bank.checkBalance(1,"2222"));
    }



    @Test
    public void testToFindAccount(){
       Account account = bank.registerCustomer("josh","chisom","2222");

        assertEquals(account, bank.findAccount(account.getAccountNumber()));

    }

    @Test
    public void testBankThrowsExceptionForInvalidAccountNumber(){
        assertThrows(InvalidAccountException.class, () -> bank.findAccount(1));

    }

    @Test
    public void testToRemoveAccountNumber(){
        Account account1 = bank.registerCustomer("mercy","daniel","2222");
        Account account2 = bank.registerCustomer("ola","ayo","1234");
        assertEquals(2,bank.getAccounts());
        bank.removeAccount(1,"2222");
        assertEquals(1,bank.getAccounts());

    }

    @Test
    public void testThatAccountNumberCanNotBeRemovedWithAWrongPassword(){
        Account account1 = bank.registerCustomer("josh","praise","1111");
        assertThrows(InvalidPinException.class,() -> bank.removeAccount(1,"2222"));
    }

}
