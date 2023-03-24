package com.example.solid.L.Before;

public class NoOrder implements IOrderCalculator {
    @Override
    public double calculate() {
        throw new IllegalStateException("No order can't calculate");
    }
}