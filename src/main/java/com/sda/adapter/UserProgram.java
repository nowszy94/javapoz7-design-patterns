package com.sda.adapter;

import java.util.List;

public class UserProgram {
    private UserAdapter userAdapter;

    public UserProgram(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }

    public void listUsers() {
        List<User> users = userAdapter.readAll();
        System.out.println("| firstName\t| lastName\t| phoneNumber\t|");
        users.forEach(e -> System.out.println("| " + e.getFirstName() + "\t| " +
                e.getLastName() + "\t| " + e.getPhoneNumber() + "\t|"));
    }
}
