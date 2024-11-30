package com.sheqet.decorator;

public class UserAdminDecorator extends UserDecorator {

    public UserAdminDecorator(User user) {
        super(user);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Performing action as an admin user");
    }
}
