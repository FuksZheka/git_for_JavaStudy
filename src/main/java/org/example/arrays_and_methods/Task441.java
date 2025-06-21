package org.example.arrays_and_methods;

import java.util.Random;
import java.util.Scanner;

public class Task441 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void init(int[] inputArray, long randomSeed) {
        Random random = new Random(randomSeed);
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(-3, 6);
        }
    }

    public static void print(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] inputNumbers) {
        int maxGrade = inputNumbers[0];
        int indexOfMax = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] > maxGrade) {
                indexOfMax = i;
                maxGrade = inputNumbers[i];
            }
        }
        return indexOfMax;
    }

    //put your code here
}