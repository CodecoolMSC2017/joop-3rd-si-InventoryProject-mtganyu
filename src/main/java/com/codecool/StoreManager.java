package com.codecool;
import java.util.List;

public class StoreManager {
    private StoreCapable storage;

    public void addStorage(StoreCapable storage) {
        this.storage = storage;

    }

    public void addCDProduct(String name, int price, int tracks) {
        storage.storeCDProduct(name, price, tracks);
    }

    public void addBookProduct(String name, int price, int size) {
        storage.storeBookProduct(name, price, size);
    }

    public String listProducts() {
        List<Product> listOfProducts = storage.getAllProduct();
        String products = "";
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (i == listOfProducts.size() - 1) {
                products += listOfProducts.get(i).getName();
            } else {
                products += listOfProducts.get(i).getName() + ", ";
            }
        }
        return products;
    }

    public int getTotalProductPrice() {
        int price = 0;
        for (Product product : storage.getAllProduct()) {
            price += product.price;

        }
        return price;
    }

}

