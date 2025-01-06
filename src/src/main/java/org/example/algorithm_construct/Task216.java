package org.example.algorithm_construct;

import java.util.Scanner;

public class Task216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[5];
        int minimum = 0;
        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = scanner.nextInt();
            if (i == 0){
                minimum = inputArray[i];
            }
            if (inputArray[i] <= minimum){
                minimum = inputArray[i];
            }
        }
        System.out.println(minimum);
    }

}
