package org.example.algorithm_construct;

import java.util.Scanner;

public class Task213 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        digit = Math.abs(digit);
        String digit_str = String.valueOf(digit);
        int sum = 0;
        if (digit_str.length() == 3) {
            for (int i = digit; i >= 1; i /= 10) {
                if (i % 2 != 0) {
                    sum += i % 10;
                } else {
                    continue;
                }
            }
        } else {
            System.out.println("ERROR");
            return;
        }
        if (sum == 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }

}
