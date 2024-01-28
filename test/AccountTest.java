import chapterThree.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testAccountNumber(){
        Account account = new Account();
        account.setNumber("12345678");
        assertEquals("12345678",account.getNumber());
    }

}
