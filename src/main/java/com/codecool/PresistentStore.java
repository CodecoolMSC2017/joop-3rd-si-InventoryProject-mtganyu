package com.codecool;

public class PresistentStore extends Store {

    @Override
    public void storeProduct(Product product) {

        getAllProduct().add(product);

    }

}
