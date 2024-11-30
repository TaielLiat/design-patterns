package com.sheqet.strategy;

/**
 * Esta clase se encarga de gestionar la elección del cliente sobre el método de pago y procesar el pago.
 * Instancia el objeto tipo IPayment y delega la responsabilidad de procesar el pago a la estrategia de pago seleccionada.
 */
public class PaymentContext {
    private IPayment paymentStrategy;

    public void setStrategy(IPayment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
            paymentStrategy.pay(amount);
    }
}
