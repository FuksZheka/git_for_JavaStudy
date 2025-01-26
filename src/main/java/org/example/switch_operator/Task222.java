package org.example.switch_operator;

import java.util.Scanner;

public class Task222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day_of_the_week_rus = scanner.nextLine();
        String day_algo;
        day_algo = day_of_the_week_rus.toLowerCase();

        switch (day_algo){
            case "понедельник":
                System.out.println("Monday");
                break;
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "среда":
                System.out.println("Wednesday");
                break;
            case "четверг":
                System.out.println("Thursday");
                break;
            case "пятница":
                System.out.println("Friday");
                break;
            case "суббота":
                System.out.println("Saturday");
                break;
            case "воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
