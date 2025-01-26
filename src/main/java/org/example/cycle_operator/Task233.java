package org.example.cycle_operator;

import java.util.Scanner;

public class Task233 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < counter; i++) {
            int input = scanner.nextInt();
            if (input < min) {
                min = input;
            }
        }
        System.out.println(min);
    }
}
