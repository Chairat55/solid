package com.example.solid.I.Before;

public class OrderB implements IOrder {

    @Override
    public void calculate() {}

    // Must implement but never use this method
    @Override
    public void getPercentTaxOfOrderA() {}
}