package org.example.String_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Task511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[3];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = scanner.nextLine();
        }
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            System.out.println((strs[i]));
        }
    }
}
