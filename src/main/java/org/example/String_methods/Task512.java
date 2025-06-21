package org.example.String_methods;

import java.util.Scanner;

public class Task512 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(";",".,");
        System.out.println(str);
    }
}
