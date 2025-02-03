package org.example.Single_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int randBasis = scanner.nextInt();
        int firstMax = 0, indMax = 0, indLastNeg = 0;
        boolean flag = false;
        int[] a = new int[arrayLength];
        Random random = new Random(randBasis);
        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextInt(-5, 16);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < arrayLength; i++) {
            if (a[i] > 0) {
                if (a[i] > firstMax) {
                    firstMax = a[i];
                    indMax = i;
                }
            }
            if (a[i] < 0) {
                indLastNeg = i;
            }
        }
        if (indMax != indLastNeg && indMax!=0) {
            int temp;
            temp = a[indMax];
            a[indMax] = a[indLastNeg];
            a[indLastNeg] = temp;
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
