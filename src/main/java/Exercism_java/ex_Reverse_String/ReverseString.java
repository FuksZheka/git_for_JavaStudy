package Exercism_java.ex_Reverse_String;

public class ReverseString {
    String reverse (String Inputstring){
        return new StringBuilder(Inputstring).reverse().toString();
    }

    String reverse2 (String InputString){

         String result = "";
        for (int i = InputString.length() - 1; i >= 0 ; i--) {
            result = result + InputString.charAt(i);
        }
        return result;
    }
    public static String reverse3(String str) {
        // 1. Преобразование строки в массив символов
        char[] chars = str.toCharArray();

        // 2. Разворот массива символов
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            // 2.1. Обмен символов местами
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // 3. Создание новой строки из массива
        return new String(chars);
    }
}
