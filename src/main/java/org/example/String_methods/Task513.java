package org.example.String_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task513 {

    public static String extractCodeword(List<String> lines) {
        List<String> parts = new ArrayList<>();
        for (String line : lines) {
            String[] splitLine = line.split(";");
            for (int i = 1; i < splitLine.length; i+=2) { // only take odd indices (parts between semicolons)
                if (i < splitLine.length && !splitLine[i].isEmpty()) {
                    parts.add(splitLine[i].toLowerCase());
                }
            }
        }
        return String.join("", parts);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lines.add(scanner.nextLine());
        }
        scanner.close();

        String codeword = extractCodeword(lines);
        System.out.println(codeword);
    }
}
