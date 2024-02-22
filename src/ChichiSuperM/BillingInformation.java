package ChichiSuperM;

public class BillingInformation {
    private int receiverPhoneNumber;

    public BillingInformation(int receiverPhoneNumber, String receiverName, Addresses deliveryAddress, CreditCardInformation creditCardInformation) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }

    private String receiverName;
    private Addresses deliveryAddress;
    private CreditCardInformation creditCardInformation;


}
