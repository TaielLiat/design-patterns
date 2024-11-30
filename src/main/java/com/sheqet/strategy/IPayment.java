package com.sheqet.strategy;

/**
 * Esta interfaz define el método pay que será implementado por las clases que representan los métodos de pago.
 *
 */
public interface IPayment {
    void pay(double amount);
}
