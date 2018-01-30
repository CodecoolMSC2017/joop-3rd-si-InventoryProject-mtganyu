package com.codecool;

import java.util.ArrayList;
import java.util.List;

public interface StoreCapable {

    default List<Product> getAllProduct(){
        return null;
    }

    default  void storeCDProduct(String name,int price,int tracks){

    }

    default void storeBookProduct(String name,int price,int pages){

    }
}
