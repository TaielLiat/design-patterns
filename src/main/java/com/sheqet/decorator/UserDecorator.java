package com.sheqet.decorator;

/**
 * Se crea una clase abstracta que implementa la interfaz User,
 * para que las clases que la extiendan puedan sobreescribir el método performAction
 * y que también tengan una instancia de User.
 */
public abstract class UserDecorator implements User {
    private User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public void performAction() {
        user.performAction();
    }
}
