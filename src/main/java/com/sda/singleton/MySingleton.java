package com.sda.singleton;

import java.util.ArrayList;
import java.util.List;

public enum MySingleton {
    INSTANCE, SECOND_INSTANCE;

    private List<String> array = new ArrayList<>();

    public void push(String value) {
        array.add(value);
    }

    public String pop() {
        return array.remove(0);
    }
}
