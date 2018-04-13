package com.sda.singleton;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    private static MyQueue instance;

    public static MyQueue instanceOf() {
        if (instance == null) {
            instance = new MyQueue();
        }
        return instance;
    }

    private Queue<String> myQueue;

    private MyQueue() {
        this.myQueue = new LinkedList<>();
    }

    public void push(String value) {
        myQueue.add(value);
    }

    public String pop() {
        return myQueue.poll();
    }
}
