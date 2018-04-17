package com.sda.factory;

import java.util.HashMap;
import java.util.Map;

public class SystemFactory {
    private Map<String, TraditionalSystem> map;

    public SystemFactory() {
        this.map = new HashMap<>();
        map.put("123", new TraditionalSystem("asdf", "ffdf", "Dfs", "sdfs"));
    }

    public TraditionalSystem createTraditionalSystem(String type) {
        return map.get(type);
    }
}
