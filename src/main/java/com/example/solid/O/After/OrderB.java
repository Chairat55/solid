package com.example.solid.O.After;

public class OrderB implements IOrderCalculator {
    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public OrderB(double price) {
        this.price = price;
    }

    @Override
    public double calculate() {
        return this.price * 1.05 * 20;
    }
}