package eStoreShop.service;

import eStoreShop.dto.ShoppingCartHistoryRequest;
import eStoreShop.model.AppUser;
import eStoreShop.model.Items;
import eStoreShop.model.ProductZ;
import eStoreShop.model.ShoppingCart;
import eStoreShop.repositories.ShoppingCartRepository;

import java.time.LocalDateTime;

public class ShoppingCartService {
    private ShoppingCartRepository shoppingCartRepository = new ShoppingCartRepository();
    private ProductService productService = new ProductService();
    private AppUserService appUserService = new AppUserService();

    public String addToCart(ShoppingCartHistoryRequest historyRequest){
        ShoppingCart cart = null;
        if (!shoppingCartRepository.ifCustomerHaveCart(historyRequest.getCustomerEmail())){
            cart = new ShoppingCart();
        }else {
            cart = shoppingCartRepository.findCustomerCart(historyRequest.getCustomerEmail());
        }
        Items item = new Items();
        ProductZ foundProduct = productService.findProduct(historyRequest.getProductName());
        item.setProduct(foundProduct);
        item.setQuantityOfItems(historyRequest.getQuantity());
        item.setTimeAdded(LocalDateTime.now());

        cart.getListOfItems().add(item);
        AppUser foundCustomer = appUserService.findAppUserByEmail(historyRequest.getCustomerEmail());
        cart.setCustomer(foundCustomer);
        cart.setTimeCreated(LocalDateTime.now());
        return shoppingCartRepository.saveShoppingOrder(cart);
    }
}
