package com.example.solid.L.Before;

public class OrderA implements IOrderCalculator {
    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public OrderA(double price) {
        this.price = price;
    }

    @Override
    public double calculate() {
        return this.price * 1.05 * 10;
    }
}