package org.example.nested_loops;

import java.util.Scanner;

public class Task251 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int counter = height + 1;
        for(int i = 1;i <= height; i++) {
            counter --;//меняется i - номер строки
            for(int j = height; j >= i; j--) { //меняется j - номер столбца
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}