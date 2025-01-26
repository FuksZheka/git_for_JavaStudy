package org.example.Single_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int randBasis = scanner.nextInt();
        double average = 0;
        double[] a = new double[arrayLength];
        Random random = new Random(randBasis);
        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextDouble(0, 5);
            average += a[i] / arrayLength;
            System.out.printf("%.2f\s", a[i]);
        }

        System.out.printf("\n%.2f\n", average);
        for (int i = 0; i < arrayLength; i++) {
            if (a[i] > average) a[i] = average;
            System.out.printf("%.2f\s", a[i]);
        }
    }
}
