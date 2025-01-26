package org.example.switch_operator;

import java.util.Scanner;

public class Task221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_month = scanner.nextInt();

        if(number_of_month <= 0 || number_of_month >= 13){
            System.out.println("Ошибка");
        }
        switch (number_of_month ){
            case 1:
                System.out.println("Январь");
                return;
            case 2:
                System.out.println("Февраль");
                return;
            case 3:
                System.out.println("Март");
                return;
            case 4:
                System.out.println("Апрель");
                return;
            case 5:
                System.out.println("Май");
                return;
            case 6:
                System.out.println("Июнь");
                return;
            case 7:
                System.out.println("Июль");
                return;
            case 8:
                System.out.println("Август");
                return;
            case 9:
                System.out.println("Сентябрь");
                return;
            case 10:
                System.out.println("Октябрь");
                return;
            case 11:
                System.out.println("Ноябрь");
                return;
            case 12:
                System.out.println("Декабрь");
                return;

            }


    }
}
