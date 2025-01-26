package org.example.Single_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int randBasis = scanner.nextInt();
        int[] a = new int[arrayLength];
        Random random = new Random(randBasis);
        int sumOfPositives = 0;
        double mulOfNegatives = 1;

        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextInt(-5, 6);
            System.out.print(a[i] + " ");
            if (a[i] < 0) mulOfNegatives *= a[i];
            else sumOfPositives += a[i];
        }

        System.out.println();

        System.out.print(sumOfPositives + " " + mulOfNegatives);
    }
}
