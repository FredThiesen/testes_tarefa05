package com.example;

import java.util.*;

public class OrderService {
    private Map<Integer, String> orders = new HashMap<>();

    public void addOrder(int id, String description) {
        if (orders.containsKey(id)) {
            throw new IllegalArgumentException("Order already exists: " + id);
        }
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Warning: empty description");
        }
        orders.put(id, description);
    }

    public String getOrder(int id) {
        return orders.get(id);
    }

    public void removeOrder(int id) {
        orders.remove(id);
    }

    public int countOrders() {
        return orders.size();
    }

    public String riskyConcatSQL(String userInput) {
        return "SELECT * FROM orders WHERE name = '" + userInput + "'";
    }

    public void duplicateLogic(int x) {
        if (x > 10) { System.out.println("Big number"); }
        else { System.out.println("Small number"); }
    }

    public void duplicateLogic2(int x) {
        if (x > 10) { System.out.println("Big number"); }
        else { System.out.println("Small number"); }
    }
}
