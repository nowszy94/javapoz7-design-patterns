package com.sda.builder;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Szymon")
                .lastName("Nowak")
                .phoneNumber("123456789")
                .birthDate("12-11-5678")
                .build();

        Arrays.asList(User.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .birthDate("12456788")
                .phoneNumber("234234234")
                .build(),
                User.builder()
        .firstName("afsdfasdf").build());

        UserWithLombok userWithLombok = new UserWithLombok.UserWithLombokBuilder()
                .firstName("Szymon")
                .lastName("Nowak")
                .phoneNumber("123456789")
                .birthDate("q42314234")
                .build();
    }
}
