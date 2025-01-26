package org.example.cycle_operator;

import java.util.Scanner;

public class Task234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int sum_delitel = 0;
        for (int i = 1; i <= input_num; i++) {
            if (input_num % i == 0) {
                sum_delitel += i;
            }
        }
        System.out.println(sum_delitel);
    }
}
