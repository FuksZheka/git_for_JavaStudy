package org.example.nested_loops;

import java.util.Scanner;

public class Task256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minInt = scanner.nextInt(), maxInt = scanner.nextInt();
        int sumOfDigit = 0, maxSumOfDigit = 0;
        int resultNum = 0;
        if (minInt > maxInt) {
            int temp;
            temp = minInt;
            minInt = maxInt;
            maxInt = temp;
        }
        for (int i = minInt; i <= maxInt; i++) {
            for (int j = i; Math.abs(j) > 0; j /= 10) {
                int calcNum = Math.abs(j);
                sumOfDigit += calcNum    % 10;
            }
            if (sumOfDigit > maxSumOfDigit) {
                maxSumOfDigit = sumOfDigit;
                resultNum = i;
            }
            sumOfDigit = 0;
        }
        System.out.println(resultNum);
    }
}
