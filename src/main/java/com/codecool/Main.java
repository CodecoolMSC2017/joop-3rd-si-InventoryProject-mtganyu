package com.codecool;

public class Main {
    public static void main(String[] args) {
        PresistentStore ps = new PresistentStore();
        StoreManager store = new StoreManager();
        store.addStorage(ps);
        store.addCDProduct("Hell hath no fury ", 1500, 10);
        store.addBookProduct("A Hosszútávfutó Magányossága", 2500, 500);
        //ps.loadProducts();
        System.out.println(store.listProducts());
        System.out.println(store.getTotalProductPrice());

    }

}
