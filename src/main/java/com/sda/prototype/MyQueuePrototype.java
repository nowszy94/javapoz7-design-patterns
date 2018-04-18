package com.sda.prototype;

import java.util.HashMap;
import java.util.Map;

public class MyQueuePrototype {

    private static Map<MyQueuePrototypeKeys, MyQueuePrototype> instances = new HashMap<MyQueuePrototypeKeys, MyQueuePrototype>() {{
        put(MyQueuePrototypeKeys.SZYMON, new MyQueuePrototype());
        put(MyQueuePrototypeKeys.JAN, new MyQueuePrototype());
        put(MyQueuePrototypeKeys.ANNA, new MyQueuePrototype());
        put(MyQueuePrototypeKeys.ASD, new MyQueuePrototype());
    }};

    public static MyQueuePrototype instanceOf(MyQueuePrototypeKeys key) {
        return instances.get(key);
    }

    private MyQueuePrototype() {
    }
}
