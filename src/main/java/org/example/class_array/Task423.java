package org.example.class_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int generatorBase = scanner.nextInt();
        int sortBeginIndex = scanner.nextInt();
        int sortEndIndex = scanner.nextInt();

        Random random = new Random(generatorBase);
        int[] x = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            x[i] = random.nextInt(10, 21);
        }
        System.out.println(Arrays.toString(x));
        Arrays.sort(x,sortBeginIndex,sortEndIndex+1);
        System.out.println(Arrays.toString(x));
    }
}
