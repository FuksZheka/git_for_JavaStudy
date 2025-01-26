package org.example.nested_loops;

import java.util.Scanner;

public class Task255 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        if (inputInt <= 0) {
            System.out.println("ERROR");
            return; // Завершаем выполнение программы при некорректном вводе
        }

        for (int i = 1; i <= inputInt; i++) {//меняется i - номер строки
            for (int j = 1; j <= inputInt; j++) { //меняется j - номер столбца
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }
    }
}
