package com.codecool;

public class BookProduct extends  Product {
    int numOfPage;


    public BookProduct(String name,int price,int numOfPage){
        super(name,price);
        this.numOfPage = numOfPage;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

}

