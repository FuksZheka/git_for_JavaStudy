package org.example.cycle_operator;

import java.util.Scanner;

public class Task235 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int control_point = scanner.nextInt();
        int counter = 0,input_num;
        do {
            input_num= scanner.nextInt();
            if ((control_point % input_num==0)&&(input_num >0)) {
                counter++;
            }
        } while (input_num >=0 );
        System.out.println(counter);
    }
}
