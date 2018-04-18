package com.sda.adapter;

import java.util.Arrays;
import java.util.List;

public class MockedUserAdapter implements UserAdapter {
    @Override
    public List<User> readAll() {
        return Arrays.asList(new User("asdfa","asdfasdf","ffd"));
    }
}
