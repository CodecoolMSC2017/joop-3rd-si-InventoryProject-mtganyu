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
        testListOfProducts = myPresistent.loadProducts("TestStore.xml");
        myPresistent.storeCDProduct("Pista",200,10);
        myPresistent.storeBookProduct("Kokero's life",1000,200);
    }

    @Test
    void getAllProduct() {
        assertEquals(myPresistent.getAllProduct().size(), 74);
    }

    @Test
    void storeCDProduct() {
        assertEquals(myPresistent.getAllProduct().get(0).getName(),"Romantic");

    }

    @Test
    void storeBookProduct() {
        assertEquals(myPresistent.getAllProduct().get(3).getName(),"Kokero's life");
    }

    @Test
    void loadProducts() {
        List<Product> loadTest = myPresistent.loadProducts("TestStore.xml");
        assertEquals(loadTest.size(), 146);
    }

    @Test
    void store() {

    }
}
