package org.example.cycle_advanced;

import java.util.Scanner;

public class Task261 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        Repeat:
        for (int i = 2; i <= Math.sqrt(n); i++) { // Оптимизированный цикл: проверка до корня квадратного
            if (n % i == 0) {
                isPrime = false;
                break Repeat;
            }
        }

        System.out.println(isPrime ? "YES" : "NO");
    }
}