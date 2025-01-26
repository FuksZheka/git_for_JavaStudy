package org.example.nested_loops;

import java.util.Scanner;

public class Task253 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        if (height <= 0) {
            System.out.println("ERROR");
            return; // Завершаем выполнение программы при некорректном вводе
        }

        for (int i = 0; i <= height; i++) {//меняется i - номер строки
            for (int j = height ; j >=1; j--) { //меняется j - номер столбца
                if (i+j > height) System.out.print(" ");
                else System.out.print("*");

            }
            System.out.println();
        }
    }
}

