package com.sda.adapter;


public class Application {
    public static void main(String[] args) {
        UsersFileFacade usersFileFacade = new UsersFileFacade("C:\\Users\\HP\\sda\\javapoz7designpatterns\\src\\main\\resources\\users.txt");
        UserFileAdapter userFileAdapter = new UserFileAdapter(usersFileFacade);
        UserProgram userProgram = new UserProgram(userFileAdapter);
        userProgram.listUsers();
    }
}
