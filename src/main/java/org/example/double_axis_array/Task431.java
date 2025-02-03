package org.example.double_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int randBasis = scanner.nextInt();
        Random random = new Random(randBasis);
        int[][] matrix = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(-5, 5);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int maximum = matrix[0][0];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                    counter = 1;
                } else if (matrix[i][j] == maximum) {
                    counter += 1;
                }
            }
        }
        System.out.print(maximum + " " + counter);
    }
}
