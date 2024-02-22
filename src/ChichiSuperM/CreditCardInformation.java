package ChichiSuperM;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Date;

public class CreditCardInformation {
    private int cvv;
    private LocalDateTime expirationYear;
    private LocalDateTime expirationMonth;
    private int cardNumber;
    private String cardName;
    private CardType type;

    public CreditCardInformation(int cvv, LocalDateTime expirationYear, LocalDateTime expirationMonth, int cardNumber, String cardName, CardType type) {
        this.cvv = cvv;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.type = type;
    }
}
