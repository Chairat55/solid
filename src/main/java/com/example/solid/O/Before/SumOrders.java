package com.example.solid.O.Before;

import java.util.List;

// Before implement OCP
public class SumOrders {

    public double sum(List<Order> orders) {
        double sum = 0.0;

        for (Order order : orders) {
            if ("ORDER_A".equals(order.getType())) {
                sum += order.getPrice() * 1.05 * 10;

            } else if ("ORDER_B".equals(order.getType())) {
                sum += order.getPrice() * 1.05 * 20;
            }
        }

        return sum;
    }

}