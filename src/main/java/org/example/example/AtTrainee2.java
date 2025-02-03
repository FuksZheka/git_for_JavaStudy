package org.example.example;

import java.util.Arrays;
import java.util.Random;

public class AtTrainee2 {
    private int n;
    //Задание - найти минимальный элемент по диагонали

    public static void diagonalFinder(int n) {
        int[][] twoDimArray2 = new int[n - 1][n - 1];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                Random random = new Random();
                twoDimArray2[i][j] = random.nextInt(100);
            }
        }

        //в данном контексте 5 - в App свидетельствует о длинне передаваемого массива длины N( в условии нужно N*N)
//            int min1 = twoDimArray[0][n - 1];
//            for (int i = 0; i < twoDimArray.length; i++) {
//                if ((min1 > twoDimArray[twoDimArray.length - 1 - i][i]) && (twoDimArray.length - 1 - i != i)) {
//                    min1 = twoDimArray[twoDimArray.length - 1 - i][i];
//                }
//            }
//            System.out.println(min1);

        int min2 = twoDimArray2[0][n - 2];
        for (int i = 0; i < twoDimArray2.length; i++) {
            if ((min2 > twoDimArray2[twoDimArray2.length - 1 - i][i]) && (twoDimArray2.length - 1 - i != i)) {
                min2 = twoDimArray2[twoDimArray2.length - 1 - i][i];
            }
        }
        System.out.println(min2);
        System.out.println(Arrays.deepToString(twoDimArray2));
    }

}
