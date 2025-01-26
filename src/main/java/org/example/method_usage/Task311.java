package org.example.method_usage;

import java.util.Scanner;

class Task311 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isPrime(number) + " ");
        }
    }
    // put your code here

    public static boolean isPrime(int number) {
        int counter = 0;
        if (number <= 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                counter++;
            }
        }
        return counter < 2;
    }
}