package org.example.double_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task432 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(), cols = scanner.nextInt();
        int randBasis = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        int counterOfPos = 0;

        Random random = new Random(randBasis);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(-10, 11);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    counterOfPos += matrix[i][j];
                } ;
            }
            if (j + 1==cols){
                System.out.print(counterOfPos);
                counterOfPos = 0;
            }else {
            System.out.print(counterOfPos+" ");
            counterOfPos = 0;}
        }
    }
}
