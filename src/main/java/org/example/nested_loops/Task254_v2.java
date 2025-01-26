package org.example.nested_loops;

import java.util.Scanner;

public class Task254_v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();

        if (width <= 0) {
            System.out.println("ERROR");
            return;
        }

         for (int i = width; i > 0; i -= 2) {
            for (int k = width - i; k > 0; k-=2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
