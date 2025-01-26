package org.example.method_usage;

import java.util.Scanner;

class Task312 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
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

    public static int simpleInRange(int a, int b) {
        int startInt, endInt, counter = 0;
        if (a < b) {
            startInt = a;
            endInt = b;
        } else {
            startInt = b;
            endInt = a;
        }
        for (int i = startInt; i <= endInt; i++) {
            if (isPrime(i)) {
                counter++;
            }
            ;
        }


        return counter;
    }
}