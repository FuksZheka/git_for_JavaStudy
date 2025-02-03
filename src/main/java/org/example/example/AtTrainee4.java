package org.example.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtTrainee4 implements org.example.example.AtTraineeInterface {

    Map<String, Integer> productMap = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        productMap.putIfAbsent(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        productMap.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        Integer i = productMap.get(product);
        if (i != null) {
            productMap.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        productMap.clear();
    }


    @Override
    public List<String> getProducts() {
        return new ArrayList<>(productMap.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return productMap.get(product);
    }
}
