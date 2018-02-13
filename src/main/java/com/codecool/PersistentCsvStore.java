
package com.codecool;

public class PersistentCsvStore extends  CsvStore{
    @Override
    protected void storeProduct(Product product) {
        getAllProduct().add(product);
    }

}
