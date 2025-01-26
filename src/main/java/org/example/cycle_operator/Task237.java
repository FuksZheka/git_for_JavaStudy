package org.example.cycle_operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task237 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit1 = scanner.nextInt(), digit2 = scanner.nextInt();
        int [] b = {digit1,digit2};
        for (int i = 1; i < Math.max(b[0],b[1] ); i++) {
            if ((b[0] % i == 0) && (b[1] % i == 0)){
//                System.out.print(i + " "); альтернативный вариант

                System.out.printf("%d ",i);
            }
        }

    }

}
