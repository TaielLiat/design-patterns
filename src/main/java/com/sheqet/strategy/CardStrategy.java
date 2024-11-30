package com.sheqet.strategy;

public class CardStrategy implements IPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
