package eStoreShop.service;

import eStoreShop.dto.CreateProductRequest;
import eStoreShop.model.ProductZ;
import eStoreShop.repositories.ProductRepository;

import java.time.LocalDate;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();


   public String createProduct(CreateProductRequest createProductRequest){
       if(productRepository.productExit(createProductRequest.getName())){throw new RuntimeException("product the name" + createProductRequest.getName() + "already exist");
       }
       ProductZ productZ = new ProductZ();
       productZ.setName(createProductRequest.getName());
       productZ.setCategory(createProductRequest.getCategory());
       productZ.setPrice(createProductRequest.getPrice());
       productZ.setDateCreated(LocalDate.now());
       productRepository.getProductDataBase().put(productZ.getName(),productZ);
       productRepository.saveProductData(productZ);
       return  "product created successfully";
   }

   public  int countProduct(){
       return productRepository.countProduct();
   }

    public ProductZ findProduct(String productName) {
       return productRepository.findProductByName(productName);
    }
}
