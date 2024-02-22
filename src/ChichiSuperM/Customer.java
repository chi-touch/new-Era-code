package ChichiSuperM;

import java.util.ArrayList;

public class Customer {
    private ArrayList<BillingInformation> mBillingInformation;
    private String shoppingCart;

    public Customer(ArrayList<BillingInformation> mBillingInformation, String shoppingCart) {
        this.mBillingInformation = mBillingInformation;
        this.shoppingCart = shoppingCart;
    }
}
