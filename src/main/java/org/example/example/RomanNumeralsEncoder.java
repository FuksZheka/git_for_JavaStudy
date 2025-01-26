package org.example.CodeWarsJava.main.java.org.example;

import java.util.List;

public class RomanNumeralsEncoder {
    /*public String solution(int n){
        int M = n / 1000; // 1950 M = 1
        int D = (n % 1000) / 500; // 1950 %1000 = 950; 950 /500 = 1
        int C = ((n%1000) % 500) / 100; // 450 / 100 = 4;
        int L = (((n%1000) % 500) % 100) /50; // L = 1;
        int X = ((((n%1000) % 500) % 100)%50) / 10;
        int Val = (((((n%1000) % 500) % 100)%50) % 10);
        int V, I;
        final boolean b = Val < 4;

        if (b) {
            I = Val;
            V = 0;
        }
        else if(Val > 5) {
            V = 1;
            I = Val % 5;
        }
        System.out.println("M" * M + "D" * D + "C" * C + "L" * L + "X" * X + "V" * V + "I" * I);
            return null;
    }*/
    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;
        List<RomanNumeral> num = RomanNumeral.getReverseSortedValues();
        int i = 0;

        while ((romanNumeral.length() > 0) && (i < num.size())) {
            RomanNumeral symbol = num.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
            if (romanNumeral.length() > 0) {
                throw new IllegalArgumentException(input + "  cannot be converted to a Roman Numeral");
            }
        }
        return result;

    }
}

