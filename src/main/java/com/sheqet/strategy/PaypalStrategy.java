package com.sheqet.strategy;

public class PaypalStrategy implements IPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Paypal");
    }
}
