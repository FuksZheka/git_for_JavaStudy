package org.example.in_out_calculate;

import java.util.Scanner;

public class Task177 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rubles, cents, result_rub, result_cent;
        double discount_cents, discount, result;
        rubles = scan.nextInt();
        cents = scan.nextInt();
        discount = scan.nextInt();
        cents = rubles * 100 + cents;
        discount_cents = cents * (discount / 100);
        discount_cents = Math.floor(discount_cents);
        result = cents - discount_cents;
        //System.out.println(discount_cents);
        result_rub = (int) (result / 100);
        result_cent = (int) (result % 100);
        System.out.printf("%02d руб %02d коп.", result_rub, result_cent);
    }
}
