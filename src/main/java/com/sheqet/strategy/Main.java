package com.sheqet.strategy;

import java.util.Scanner;

/**
* Esta clase maneja la entrada del usuario para un pago ficticio.
*
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Bitcoin");
        int option = scanner.nextInt();


//        * Se crea un objeto de tipo PaymentContext y se le asigna un tipo de pago.
//        * El tipo de pago se asigna dependiendo de la opción seleccionada por el usuario.
        switch (option) {
            case 1:
                context.setStrategy(new CardStrategy());
                break;
            case 2:
                context.setStrategy(new PaypalStrategy());
                break;
            case 3:
                context.setStrategy(new BitcoinStrategy());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

//        * Una vez ya elegida la estrategia de pago, se le pide al usuario que ingrese el monto a pagar.
//        * El monto ingresado se envía al método processPayment de la clase PaymentContext.
//        * La clase PaymentContext se encarga de delegar la responsabilidad de procesar el pago a la estrategia de pago seleccionada.
        System.out.println("Enter the amount to pay:");
        context.processPayment(scanner.nextDouble());
    }
}