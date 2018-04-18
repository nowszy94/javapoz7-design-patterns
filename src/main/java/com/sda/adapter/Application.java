package com.sda.adapter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        UserFileAdapter userFileAdapter = new UserFileAdapter("C:\\Users\\HP\\sda\\javapoz7designpatterns\\src\\main\\resources\\users.txt");
        UserAdapter userAdapter = new MockedUserAdapter();
        UserProgram userProgram = new UserProgram(userAdapter);
        userProgram.listUsers();
    }
}
