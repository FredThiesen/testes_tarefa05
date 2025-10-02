package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    public void testAddAndCount() {
        OrderService os = new OrderService();
        os.addOrder(1, "Laptop");
        assertEquals(1, os.countOrders());
    }

    @Test
    public void testGetOrder() {
        OrderService os = new OrderService();
        os.addOrder(2, "Phone");
        assertEquals("Phone", os.getOrder(2));
    }

    // intentionally missing tests for removeOrder, riskyConcatSQL, duplicateLogic

    @Test
    public void testRemoveOrder() {
        OrderService os = new OrderService();
        os.addOrder(3, "Tablet");
        assertEquals(1, os.countOrders());
        os.removeOrder(3);
        assertEquals(0, os.countOrders());
        assertNull(os.getOrder(3));
    }

    @Test
    public void testRiskyConcatSQL() {
        OrderService os = new OrderService();
        String userInput = "O'Reilly";
        String expected = "SELECT * FROM orders WHERE name = 'O'Reilly'";
        assertEquals(expected, os.riskyConcatSQL(userInput));
    }
}
