package org.example.method_usage;

import java.util.Scanner;

public class Task315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        String inputStr = scanner.next();
        char inputSymbol = inputStr.charAt(0);
        printTriangle(width, inputSymbol);
    }

    public static void printTriangle(int height, char printSymbol) {
        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }
        int counterOfChars = 0;
        while (height > 0) { //есть звезды для вывода

            int lenghtOfSpace = (height % 2 == 0) ? height / 2 : (height / 2 + 1);
            int Even =(height % 2==0) ? -1:0;

            for (int i = 1; i < lenghtOfSpace; i++) {
                System.out.print(" ");
            }
            for (int i = Even; i <= counterOfChars; i++) {
                System.out.print(printSymbol);
            }

            System.out.println();
            counterOfChars += 2;
            height -= 2; //а звезд на 2 меньше
        }
    }
}
