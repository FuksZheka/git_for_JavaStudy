package LeetCode.LengthofLastWord;

public class Solution {

    public int lengthOfLastWord1(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }

    /**
     * Вариант решения "lengthOfLastWord" лучше, чем "lengthOfLastWord1"
     * Тут с конца строки определяется последнее слово с помощью 1 while, затем после определения последнего слова
     * мы инкрементируем переменную длина слова и идем дальше по последнему слову. Когда последнее слово заканчивается
     * (элемент перед последним словом пробел - заканчиваем выполнение программы и возвращаем длину последнего слова)
     */
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
