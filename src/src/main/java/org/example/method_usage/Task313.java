package org.example.method_usage;

import java.util.Scanner;

class Task313 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }
    // put your code here
    public static int printDivider(int number){
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.print(i+" ");
            }
        }
        return number;
    }
}