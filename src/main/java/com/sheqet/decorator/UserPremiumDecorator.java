package com.sheqet.decorator;

// Decorador que agrega el comportamiento de un usuario premium.
public class UserPremiumDecorator extends UserDecorator {
    public UserPremiumDecorator(User user) {
        super(user);
    }

    @Override
    public void performAction() {
        super.performAction();  // Llamamos al comportamiento original.
        System.out.println("Performing additional actions as a premium user.");
    }
}
