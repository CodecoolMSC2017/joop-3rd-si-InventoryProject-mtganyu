package com.codecool;

import java.util.ArrayList;
import java.util.*;

public interface StoreCapable {
    public List<Product> getAllProduct();

    public void storeCDProduct(String name, int price, int size);

    public void storeBookProduct(String name, int price, int size);

}
