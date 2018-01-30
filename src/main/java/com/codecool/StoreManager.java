package com.codecool;

import java.util.ArrayList;
import  java.util.List;
public class StoreManager {

    List<CDProduct> cds = new ArrayList<>();
    List<BookProduct> books = new ArrayList<>();

    public String addStorage(StoreCapable storage){
        return "";
    }

    public void addCDProduct(String name, int price, int tracks){
        CDProduct cd = new CDProduct(name,price,tracks);
        this.cds.add(cd);
    }

    public void addBookProduct(String name, int price, int pages){
        BookProduct book = new BookProduct(name,price,pages);
        this.books.add(book);
    }

    public String listProducts(){
        return "";
    }
    public int getTotalProductPrice(){
        return 0;
    }
}
