package org.example.in_out_calculate;

import java.util.Scanner;

public class Task178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble(), result;
        result = Math.log(x + 7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.println(Math.round(result));
        String formatted = String.format("%.4f", result);
        System.out.println(formatted); // Вывод: 123.4568
    }
}
