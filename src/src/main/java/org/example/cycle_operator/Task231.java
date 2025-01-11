package org.example.cycle_operator;

import java.util.Scanner;

public class Task231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10, x = 0;
        int counter = 0;
        while (x < n){
            int mark = scanner.nextInt();
            if (mark < 4 ){
                counter++;
            }
            x++;
        }
        System.out.println(counter);
    }
}
