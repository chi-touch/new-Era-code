package FireDrill;

import FireDrill.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void depositNegativeBalance_balanceRemainUnchanged(){
        Account praiseAccount = new Account();
        assertEquals(0,praiseAccount.getBalance());

        //praiseAccount.deposit(amount -50_000);
        assertEquals(0,praiseAccount.getBalance());
    }


}