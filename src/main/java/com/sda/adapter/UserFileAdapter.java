package com.sda.adapter;

import java.util.List;
import java.util.stream.Collectors;

public class UserFileAdapter implements UserAdapter {

    private UsersFileFacade usersFileFacade;

    public UserFileAdapter(UsersFileFacade usersFileFacade) {
        this.usersFileFacade = usersFileFacade;
    }

    public List<User> readAll() {
        List<UserDto> userDtos = usersFileFacade.getAll();
        return userDtos.stream()
                .map(dto -> new User(dto.getFirstName(), dto.getLastName(), dto.getPhoneNumber()))
                .collect(Collectors.toList());
    }
}
