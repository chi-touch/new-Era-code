package ChichiSuperM;

import java.math.BigDecimal;

public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName, BigDecimal price, String product, String description, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.product = product;
        this.description = description;
        this.productCategory = productCategory;
    }

    private BigDecimal price;
    private String product;
    private String description;
    private String productCategory;

}
