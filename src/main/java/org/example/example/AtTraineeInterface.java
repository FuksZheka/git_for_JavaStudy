package org.example.CodeWarsJava.main.java.org.example;

import java.util.List;

public interface AtTraineeInterface {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}

