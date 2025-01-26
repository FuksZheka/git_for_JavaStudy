package org.example.in_out_calculate;

import java.util.Scanner;

class Task179 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double term1 = Math.sin(3 * Math.PI - 2 * a);
        double term2 = Math.cos(5 * Math.PI + 2 * a);
        double z = 2 * Math.pow(term1, 2) * Math.pow(term2, 2);
        double term1y = (5.0 / 2.0) * Math.PI - 8 * a;
        double sinTerm = Math.sin(term1y);
        double y = (1.0 / 4.0) - (1.0 / 4.0) * sinTerm;
        System.out.printf("%.5f %.5f", z, y);

    }
}