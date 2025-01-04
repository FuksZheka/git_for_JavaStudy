package org.example;

import java.util.Scanner;

public class Task174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rub = scan.nextInt();
        int cent = scan.nextInt();
        rub = rub + cent / 100;
        cent = cent % 100;
        System.out.println(rub+" р. "+cent+" к.");
    }
}
