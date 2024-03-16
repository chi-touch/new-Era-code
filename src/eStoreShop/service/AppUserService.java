package eStoreShop.service;

import eStoreShop.RoleZ;
import eStoreShop.dto.RegisterAppUserRequest;
import eStoreShop.model.AppUser;
import eStoreShop.repositories.AppUserStorage;

import java.time.LocalDate;

public class AppUserService {
    private AppUserStorage appUserStorage = new AppUserStorage();




    private AppUser modelMapper(RegisterAppUserRequest registerCustomerRequest){
        if(appUserStorage.ifUserExists((registerCustomerRequest.getEmailAddress()))){
            throw  new RuntimeException( "user with the email address "+ registerCustomerRequest.getEmailAddress()+" already exits");
        }

        AppUser appUser = new AppUser();
        appUser.setEmailAddress(registerCustomerRequest.getEmailAddress());
        appUser.setName(registerCustomerRequest.getName());
        appUser.setHomeAddress(registerCustomerRequest.getHomeAddress());
        appUser.setPin(registerCustomerRequest.getPin());
        appUser.setDateCreated(LocalDate.now());
        appUser.setPhoneNumber(registerCustomerRequest.getPhoneNumber());
        appUser.setAge(registerCustomerRequest.getAge());
        return appUser;
    }

    public String registerCustomer(RegisterAppUserRequest registerCustomerRequest) {
      AppUser appUser = modelMapper(registerCustomerRequest);
        appUser.setRole(RoleZ.CUSTOMER);
        return appUserStorage.saveAppUser(appUser);

    }

    public String registerAdmin(RegisterAppUserRequest registerAdminRequest){

        AppUser appUser = modelMapper(registerAdminRequest);
        appUser.setRole(RoleZ.ADMIN);
        return appUserStorage.saveAppUser(appUser);
    }

    public String registerSeller(RegisterAppUserRequest registerSellerRequest){
       AppUser appUser = modelMapper(registerSellerRequest);
        appUser.setRole(RoleZ.SELLERS);
        return appUserStorage.saveAppUser(appUser);
    }

    public AppUser findAppUserByEmail(String email) {
        return appUserStorage.findAppUserByEmail(email);
    }

    public int getNumberOfCustomer() {
        return appUserStorage.countCustomer();
    }


}
