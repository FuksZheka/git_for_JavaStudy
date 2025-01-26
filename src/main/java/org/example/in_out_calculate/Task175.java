package org.example.in_out_calculate;

import java.util.Scanner;

public class Task175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sal1, sal2, sal3, max, min;
        sal1 = scan.nextInt();
        sal2 = scan.nextInt();
        sal3 = scan.nextInt();
        min = sal1 < sal2 ? sal1 : sal2;
        min = min < sal3 ? min : sal3;
        max = sal1 > sal2 ? sal1 : sal2;
        max = max > sal3 ? max : sal3;

        System.out.println(max - min);
    }
}
