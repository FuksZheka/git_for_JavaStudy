package org.example.in_out_calculate;

import java.util.Scanner;

public class Task176 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours, minutes, seconds;
        seconds = scan.nextInt();
        // Выделение часов
        hours = seconds / 3600;
        seconds = seconds % 3600;
        // выделение минут
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд ");
        // альтернативный вариант
        System.out.printf("%d часов %d минут %d секунд", hours, minutes, seconds);
    }

}
