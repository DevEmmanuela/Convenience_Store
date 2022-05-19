package org.example;

import org.example.classes.Address;
import org.example.classes.Applicant;
import org.example.classes.Manager;
import org.example.classes.Products;
import org.example.enums.Level;

public class Main {
    public static void main(String[] args) {

        //To hire

        Applicant newCashier = new Applicant();
        newCashier.setName("Emmanuela");
        newCashier.setAge(35);
        newCashier.setQualification("Ph.D");
        newCashier.setPhoneNumber("12345678901");
        Address newCashierAddress = new Address(2, "Adebayo Street");

        Address managerAddress = new Address(5, "Adebayo Street");
        Manager manager = new Manager("Chinaza", "M.sc", 30, "09876543210",managerAddress,
                "naza@gmail.com", Level.MANAGEMENTSTAFF);

        manager.hire(newCashier, "B.sc", "M.sc", "Ph.D", 35);

        Store store = new Store();
        Products products = new Products("Food", 300, 1);

        manager.update(store,products);
        System.out.println(store.getProductsList());
//        System.out.println(products.getProductList());

        // Customer to buy



        Customers customer = new Customers();
        customer.setName("Peace");
        customer.setPhoneNumber("12345");
        customer.setEmailAddress("peace@gmail.com");

        customer.buy(store,"Food");


    }
}