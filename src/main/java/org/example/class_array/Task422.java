package org.example.class_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int generatorBase = scanner.nextInt();

        Random random = new Random(generatorBase);
        double[] x = new double[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            x[i] = random.nextDouble(0, 2);
        }

        String xa = Arrays.toString(x);
        System.out.println(xa);
        Arrays.sort(x);
        System.out.println(x[0] + x[arrayLength - 1]);
    }
}
