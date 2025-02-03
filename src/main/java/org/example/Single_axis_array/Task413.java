package org.example.Single_axis_array;

import java.util.Scanner;

public class Task413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        arr[0] = scanner.nextInt();
        int minimum = arr[0];
        int lastMinIndex = 0; // Индекс последнего минимального элемента

        for (int i = 1; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] <= minimum) { // <= важно для нахождения последнего минимального
                minimum = arr[i];
                lastMinIndex = i;
            }
        }

        arr[lastMinIndex] = -1; // Замена последнего минимального элемента

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Добавлено для завершения строки вывода
        scanner.close(); // Добавлено для закрытия Scanner
    }
}