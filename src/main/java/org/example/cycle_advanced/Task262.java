package org.example.cycle_advanced;

import java.util.Scanner;

public class Task262 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int lastInt = scanner.nextInt();
        scanner.close();
        for (int i = firstInt; i < lastInt; i++) { // Оптимизированный цикл: проверка до корня квадратного
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}


