package org.example.switch_operator;

import java.util.Scanner;

public class Task225 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("ERROR");
        }
    }
}
