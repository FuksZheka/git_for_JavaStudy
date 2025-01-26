package org.example.algorithm_construct;

import java.util.Scanner;

//Задание полезно упоминанием конструкции else-if!

public class Task212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double point1, point2;
        point1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        point2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (point1 > point2) {
            System.out.println("Вторая точка ближе");
        } else if (point1 < point2) {
            System.out.println("Первая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }

    }
}
