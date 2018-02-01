package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    PresistentStore myPresistent;
    CDProduct cd;
    BookProduct book;
    List<Product> testListOfProducts;

    @BeforeEach
    void setUp() {
        myPresistent = new PresistentStore();
        testListOfProducts = myPresistent.loadProducts("Products.xml");
        myPresistent.storeCDProduct("Zambo jimmy best of",200,10);
        myPresistent.storeBookProduct("Legyek ura",1000,200);
    }

    @Test
    void getAllProduct() {
        assertEquals(4, myPresistent.getAllProduct().size());
    }

    @Test
    void storeCDProduct() {
        assertEquals("Legyek ura",myPresistent.getAllProduct().get(3).getName());

    }

    @Test
    void storeBookProduct() {
        assertEquals("Zambo jimmy best of",myPresistent.getAllProduct().get(2).getName());
    }

    @Test
    void loadProducts() {
        List<Product> loadTest = myPresistent.loadProducts("Products.xml");
        assertEquals(6, loadTest.size());
    }


}
