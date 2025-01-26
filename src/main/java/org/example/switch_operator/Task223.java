package org.example.switch_operator;

import java.util.Scanner;

public class Task223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day_of_the_week = scanner.nextInt();

        switch (day_of_the_week){
            case 1, 2 , 3 , 4 , 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
