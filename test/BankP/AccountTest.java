package BankP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;
    @BeforeEach
    public void initializeAccount(){
        account = new Account("chichi",350685601,"2222");
    }

    @Test
    public void testForDeposit(){
        account.deposit(1000);
        assertEquals(1000, account.checkBalance("2222"));
    }


   @Test
    public void testForWithdraw(){
        account.deposit(10000);
        account.withdraw(7000,"2222");
        assertEquals(3000,account.checkBalance("2222"));
    }

    @Test
    public void testThatAmountGreaterThanBalanceCantBeWithdrawn(){
        account.deposit(10000);

        assertThrows(InsufficientFundsException.class, ()-> account.withdraw(30000,"2222"));
    }

    @Test
    public void testForNegativeAmountWithdrawn() {
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(-5000,"2222"));

    }

    @Test
    public void testThatBalanceCanBeChecked(){
        account.deposit(50000);
        assertEquals(50000,account.checkBalance("2222"));

    }

    @Test
    public void testForWrongPin(){
        account.deposit(50000);
        assertThrows(InvalidPinException.class,()-> account.checkBalance("000033"));

    }


}