package org.example.nested_loops;

import java.util.Scanner;

public class Task252 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();

        if (height <= 0 || width <= 0) {
            System.out.println("ERROR");
            return; // Завершаем выполнение программы при некорректном вводе
        }

        for(int i = 1; i <= height; i++) {  //меняется i - номер строки
            for(int j = 1; j <= width; j++) { //меняется j - номер столбца

                if (i == 1|| i ==height || j==1 || j == width){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

