package org.example.algorithm_construct;

import java.util.Locale;
import java.util.Scanner;

public class Task217 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        double tariff = scanner.nextDouble();
        double result = 0;

        if (hours < 0 || tariff < 0) {
            System.out.println("ERROR");
            return;
        }
        if (hours <= 20) {
            result = hours * tariff;
        } else if (hours > 20 && hours <= 40) {
            result = 20 * tariff + (hours - 20) * tariff * 1.5;
        } else if (hours > 40) {
            result = 20 * tariff + 20 * tariff * 1.5 + (hours - 40) * tariff * 2;
        }
        System.out.printf("%.2f", result);
    }

}
