package org.example.algorithm_construct;

import java.util.Scanner;

public class Task214 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        digit = Math.abs(digit);
        String digit_str = String.valueOf(digit);
        int sum_13 = 0;
        int sum_46 = 0;
        if (digit_str.length() == 6) {
            for (int i = digit; i > 999; i /= 10) {
                sum_46 += i % 10;
            }
            int digit123 = digit / 1000;
            for (int j = digit123; j > 0; j /= 10) {
                sum_13 += j % 10;
            }
        } else {
            System.out.println("ERROR");
            return;
        }

        if (sum_13 == sum_46) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
