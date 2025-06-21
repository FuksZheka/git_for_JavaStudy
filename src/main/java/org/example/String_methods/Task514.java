package org.example.String_methods;


import java.util.Scanner;

public class Task514 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static boolean isGMailAddress(String string) {
        String substring = string.substring(string.lastIndexOf('@'));
        String baseOfAdress = string.substring(0, string.indexOf("@"));
        if (baseOfAdress.length()>2 && substring.equals("@gmail.com") && string.indexOf("@") == string.lastIndexOf("@")) {
            return true;
        } else
            return false;
    }// put your code here
}
