package org.example.double_axis_array;

import java.util.Random;
import java.util.Scanner;

public class Task433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(), cols = scanner.nextInt();
        int randBasis = scanner.nextInt();

        Random random = new Random(randBasis);
        int[][] matrix = new int[rows][cols];
        boolean indexOfNegativeFlag = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(-10,11);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0 && !indexOfNegativeFlag) {
                    System.out.println(j);
                    indexOfNegativeFlag = true;
                }
            }
            if(!indexOfNegativeFlag){
                System.out.println("NO");
            }
            indexOfNegativeFlag = false;
        }
    }
}
