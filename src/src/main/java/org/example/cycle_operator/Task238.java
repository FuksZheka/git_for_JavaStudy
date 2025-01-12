package org.example.cycle_operator;

import java.util.Scanner;

public class Task238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineType =scanner.nextInt(),lineLength = scanner.nextInt();
        char symbolType=scanner.next().charAt(0);
        if (lineLength <=0){
            System.out.println("ERROR");
            return;
        }
        switch (lineType){
            case 1:
                for (int i = 0; i < lineLength; i++) {
                    System.out.println(symbolType);
                }
                break;
            case 2:
                for (int i = 0; i < lineLength; i++) {
                    System.out.print(symbolType);
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
