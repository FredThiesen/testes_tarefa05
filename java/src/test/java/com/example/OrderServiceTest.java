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
}
