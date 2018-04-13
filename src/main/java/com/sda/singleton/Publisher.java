package com.sda.singleton;

import java.util.Scanner;

public class Publisher {
    public void publisher() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String value = scanner.nextLine();
            MyQueue.instanceOf().push(value);
        }
    }
}
