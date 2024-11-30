package com.sheqet.decorator;

import java.util.Scanner;

/**
 * *
 * Esta clase crea un objeto base y, si es necesario, le agrega más funcionalidades.
 * Para hacer esto, se crea primero un objeto base y luego, si es necesario, se envuelve en una o más clases decoradoras.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new RegularUser();

        System.out.println("Select a user type: ");
        System.out.println("1. Regular User");
        System.out.println("2. Admin User");
        System.out.println("3. Premium User");
        int userType = scanner.nextInt();

        switch (userType) {
            case 2:
                user = new UserAdminDecorator(user);
                break;
            case 3:
                user = new UserPremiumDecorator(user);
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }

        System.out.println("Executing action for selected user type...");
        user.performAction();
    }
}
