package org.example;

import org.example.classes.Products;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Products> productsList = new ArrayList<>();

    public Store() {

    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public Store(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
