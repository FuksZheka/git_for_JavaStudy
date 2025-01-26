package org.example.cycle_operator;

import java.util.Scanner;

public class Task232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b<a){
            int temp = b;
            b = a;
            a = temp;
        }
        double result = 1;
        while (a<=b){
            result *=a;
            a++;
        }
        System.out.println(result);
    }
}
