package org.example.cycle_advanced;

import java.util.Scanner;

public class Task263 {
    public static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first > second){
            int temp = first;
            first = second;
            second = temp;
        }
        boolean flag = false;
        capi:
        for (int i = first; i < second; i++) {
            if(!isPrime(i)){
                System.out.println(i);
                flag = true;
                break capi;
            }
        }
        if (!flag) System.out.println("NO");
    }
}
