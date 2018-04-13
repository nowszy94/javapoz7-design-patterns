package com.sda.singleton;

public class Consumer implements Runnable {
    private MyQueue myQueue;

    public Consumer() {
        myQueue = MyQueue.instanceOf();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String pop = MyQueue.instanceOf().pop();
            System.out.println(pop);
        }
    }
}
