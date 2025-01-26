package org.example.method_usage;

import java.util.Locale;
import java.util.Scanner;

public class Task316 {
    public static float square(float len) {
        return len * len;
    }


    public static float square(float len, float width) {
        return len * width;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int figureType = scanner.nextInt();
        switch (figureType) {
            case 1:
                float len = scanner.nextFloat();
                System.out.printf("%,.2f",square(len));
                break;
            case 2:
                float len2 = scanner.nextFloat();
                float width2 = scanner.nextFloat();
                System.out.printf("%,.2f",square(len2, width2));
                break;
        }
    }
}
