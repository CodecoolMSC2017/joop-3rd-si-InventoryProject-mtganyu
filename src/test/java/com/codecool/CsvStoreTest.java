package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvStoreTest {
    PersistentCsvStore ps;
    @BeforeEach
    void setUp() {
        ps = new PersistentCsvStore();
        ps.storeCDProduct("TestCd",200,10);
        ps.storeBookProduct("TestBook",1000,200);
    }

    @Test
    void getAllProduct() {
        assertEquals(2,ps.getAllProduct().size());
    }

    @Test
    void storeCDProduct() {
        assertEquals("TestCd",ps.getAllProduct().get(0).getName());
    }

    @Test
    void storeBookProduct() {
        assertEquals("TestBook",ps.getAllProduct().get(1).getName());
    }
}
