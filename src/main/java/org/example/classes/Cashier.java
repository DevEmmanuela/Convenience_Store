package org.example.classes;

import org.example.Store;
import org.example.enums.Level;

public class Cashier extends Staff {

    public Cashier(String name, String qualification, Integer age, String phoneNumber, Address houseAddress, String email, Level staffLevel) {
        super(name, qualification, age, phoneNumber, houseAddress, email, staffLevel);
    }

    public static void sell(Store store, String customersProduct){
        for (Products availableProduct : store.getProductsList()) {
            if (availableProduct.getProductName().equals(customersProduct)){
                System.out.println("product available");

                dispenseReceipt(availableProduct.getProductName(), availableProduct.getPrice());

            }else {
                System.out.println("product not available");
            }
        }
    }

    public static void dispenseReceipt(String name, Integer price){
        System.out.println(name + " was purchased at " + price);
        System.out.println("Thanks for patronizing us.");
    }


}
