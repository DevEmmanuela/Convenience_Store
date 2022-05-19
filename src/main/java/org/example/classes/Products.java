package org.example.classes;

import java.util.HashMap;

public class Products {

    private String productName;
    private Integer price;
    private Integer quantity;


    public Products() {
    }

    public Products(String productName, Integer price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }



    public String getProductName() {
        return productName;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
