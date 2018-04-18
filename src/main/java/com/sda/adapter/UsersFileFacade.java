package com.sda.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersFileFacade {
    private String path;

    public UsersFileFacade(String path) {
        this.path = path;
    }

    public List<UserDto> getAll() {
        List<UserDto> users = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine()) {
                String value = scanner.nextLine();
                String[] array = value.split(",");
                UserDto user = new UserDto();
                user.setFirstName(array[0]);
                user.setLastName(array[1]);
                user.setPhoneNumber(array[2]);
                user.setCity(array[3]);
                user.setStreet(array[4]);
                user.setFlatNumber(Integer.valueOf(array[5]));
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            System.out.println("WARN: FILE NOT FOUND");
        }
        return users;
    }
}
