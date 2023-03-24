package com.example.solid.O.After;

import java.util.List;

// After implement OCP
public class SumOrders {

    public double sum(List<IOrderCalculator> orders) {
        double sum = 0.0;

        for (IOrderCalculator order : orders) {
            sum += order.calculate();
        }

        return sum;
    }

}