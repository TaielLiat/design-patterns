package com.sheqet.strategy;

public class BitcoinStrategy implements IPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Bitcoin");
    }
}
