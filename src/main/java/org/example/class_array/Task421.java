package org.example.class_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int generatorBase = scanner.nextInt();
        int controlDigit = scanner.nextInt();
        Random random = new Random(generatorBase);
        int[] x = new int[arrayLength];
        boolean find = false;
        int controlDigitIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            x[i] = random.nextInt(2, 16);
        }
        Arrays.sort(x);
        String xa = Arrays.toString(x);
        System.out.println(xa);
        for (int i = 0; i < arrayLength; i++) {
            if (x[i] == controlDigit) {
                controlDigitIndex = i;
                find = true;
                break;
            }
        }
        int[] y = new int[controlDigitIndex + 1];
        for (int i = 0; i < y.length; i++) {
            y[i] = x[i];
        }
        if (find) {

            String xaxa = Arrays.toString(y);
            System.out.println(xaxa);

        } else System.out.println("ERROR");
    }
}
