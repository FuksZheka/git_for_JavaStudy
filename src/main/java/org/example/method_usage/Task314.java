package org.example.method_usage;

import java.util.Scanner;

public class Task314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }
    public static int counterOfDivides(int inputNum){
        int countOfDivides = 0;
        for (int i = 1; i < inputNum; i++) {
            if (inputNum % i == 0){
                countOfDivides++;
            }
        }
        return countOfDivides;
    }


    public static int maxNumberDivider(int startInt, int endInt){
        int maximumOfDivides = 0;
        int finalNum = 0;
        for (int i = startInt; i <= endInt; i++) {
            int localMaximum = counterOfDivides(i);

            if (localMaximum > maximumOfDivides){
                maximumOfDivides = localMaximum;
                finalNum = i;
            }
        }
        return finalNum;
    }
}
