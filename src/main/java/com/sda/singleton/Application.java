package com.sda.singleton;

public class Application {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Consumer consumer = new Consumer();
        Thread thread = new Thread(consumer);
        thread.start();
        publisher.publisher();
    }
}
