package eStoreShop.service;

import eStoreShop.dto.CreateProductRequest;
import eStoreShop.dto.RegisterAppUserRequest;
import eStoreShop.dto.ShoppingCartHistoryRequest;
import eStoreShop.model.AppUser;
import eStoreShop.model.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartServiceTest {
    private CreateProductRequest createProductRequest;
    private CreateProductRequest createProductRequest1;
    private RegisterAppUserRequest registerCustomerRequest;
    private  RegisterAppUserRequest registerCustomerRequest2;
    private ShoppingCartService shoppingCartService = new ShoppingCartService();
    private AppUserService appUserService = new AppUserService();
    private ProductService productService = new ProductService();
    ShoppingCartHistoryRequest shoppingCartHistoryRequest;

    @BeforeEach
    void  setUp(){
        registerCustomerRequest = new RegisterAppUserRequest();
        registerCustomerRequest.setName("chi chi");
        registerCustomerRequest.setPin("56754");
        registerCustomerRequest.setPhoneNumber("88708-989=");
        registerCustomerRequest.setEmailAddress("chichi@gmail");


        createProductRequest = new CreateProductRequest();
        createProductRequest.setName("tecno phone");
        createProductRequest.setCategory(ProductCategory.ELECTRONICS);
        createProductRequest.setPrice(new BigDecimal(9000));

        createProductRequest1 = new CreateProductRequest();
        createProductRequest1.setName("pot");
        createProductRequest1.setCategory(ProductCategory.UTENSILS);
        createProductRequest1.setPrice(new BigDecimal(7000));

        shoppingCartHistoryRequest = new ShoppingCartHistoryRequest();
        shoppingCartHistoryRequest.setCustomerEmail(registerCustomerRequest.getEmailAddress());
        shoppingCartHistoryRequest.setProductName(createProductRequest.getName());
        shoppingCartHistoryRequest.setQuantity(3);
    }

    @Test
    void testThatWeCanAddProductToCart(){
        productService.createProduct(createProductRequest);
        productService.createProduct(createProductRequest1);
        assertEquals(2,productService.countProduct());

        appUserService.registerCustomer(registerCustomerRequest);
        AppUser foundAppUser =  appUserService.findAppUserByEmail("chichi@gmail");
        assertEquals("chichi@gmail",foundAppUser.getEmailAddress());


        shoppingCartService.addToCart(shoppingCartHistoryRequest);
    }

}