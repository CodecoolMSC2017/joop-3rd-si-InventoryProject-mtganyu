package com.codecool;

public class Main {
    public static void main(String[] args) {
        //PresistentStore ps = new PresistentStore();
        PersistentCsvStore pcsvs = new PersistentCsvStore();
        StoreManager store = new StoreManager();
        //store.addStorage(ps);
        store.addStorage(pcsvs);
        store.addCDProduct("Süsü a sárkány",20000,10);
        store.addBookProduct("A Hosszútávfutó Magányossága", 2500, 500);
        System.out.println(store.listProducts());
        pcsvs.storeCsv();
        //store.addCDProduct("Hell hath no fury ", 1500, 10);
        //store.addBookProduct("A Hosszútávfutó Magányossága", 2500, 500);
        //ps.store("Products.xml");
        //ps.loadProducts("Products.xml");
        //System.out.println(store.listProducts());
        //System.out.println(store.getTotalProductPrice());

    }

}
