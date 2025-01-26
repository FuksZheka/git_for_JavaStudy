package org.example.cycle_advanced;

import java.util.Scanner;

public class Task264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        int counter = 0;
        repeater:
        for (int i = 2; i < inputInt; i++) {

            if (inputInt % i == 0) {
                if (i % 2 == 0) counter += i;
            } else continue repeater;

        }
        System.out.println(counter);
    }
}
