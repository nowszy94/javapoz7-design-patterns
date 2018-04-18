package com.sda.adapter;

import java.util.List;
import java.util.stream.Collectors;

public class AddressFileAdapter implements AddressAdapter {

    private UsersFileFacade usersFileFacade;

    public AddressFileAdapter(UsersFileFacade usersFileFacade) {
        this.usersFileFacade = usersFileFacade;
    }

    @Override
    public List<Address> getAll() {
        List<UserDto> users = usersFileFacade.getAll();
        return users.stream()
                .map(user -> new Address(user.getCity(), user.getStreet(), user.getFlatNumber()))
                .collect(Collectors.toList());
    }
}
