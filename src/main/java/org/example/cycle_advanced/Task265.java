package org.example.cycle_advanced;

import java.util.Scanner;

public class Task265 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDigit = scanner.nextInt(), endDigit = scanner.nextInt();
        int counter = 0;

        anotherOne:
        while (startDigit <= endDigit){
            for (int i = 2; i <= startDigit; i++) {
                if (startDigit % i == 0){
                    counter += i;
                    startDigit++;
                    continue anotherOne;
                }
            }
            startDigit++;
        }
        System.out.println(counter);
    }
}
