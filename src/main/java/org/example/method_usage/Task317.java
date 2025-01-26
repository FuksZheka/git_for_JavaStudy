package org.example.method_usage;

import java.util.Locale;
import java.util.Scanner;

class Task317 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
    }
    // put your code here
    public static double average(double a, double b, double c){
        return (float) ((a+b+c)/3);
    }
    public static double average(double a, double b){
        return (float) ((a+b)/2);
    }

}