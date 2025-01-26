package org.example.CodeWarsJava.main.java.org.example;

import java.util.Random;

public class gasda {
    public static int gav(int n) {
        int[][] twoDimArray2 = new int[n][n];
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        twoDimArray2[0][0] = randomNumber;
        System.out.println(twoDimArray2[0][0]);
        return twoDimArray2[0][0];
    }
}
