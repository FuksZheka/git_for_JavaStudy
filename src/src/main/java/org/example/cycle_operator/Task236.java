package org.example.cycle_operator;

import java.util.Scanner;

public class Task236 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input_number = Math.abs(scanner.nextInt());
        int counter_digits = 0,sum_of_digits = 0;
    do {
        sum_of_digits += input_number % 10;
        counter_digits += 1;
        input_number /= 10;
    }
    while (input_number>0);
        System.out.println(counter_digits + " " + sum_of_digits);

    }

}
