package org.example.in_out_calculate;

import java.util.Scanner;

public class Task173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double percent;
        percent = scanner.nextDouble();
        System.out.println("С днем рождения, " + name + "! Сегодня Вам " + age + "!");
        System.out.println("По этому поводу дарим Вам скидку " + percent + "%");
        System.out.println("на весь ассортимент нашего сайта!");
    }
}
