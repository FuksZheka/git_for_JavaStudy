package LeetCode.ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; //левый указатель
        int right = s.length() -1; // правый указатель

        while (left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            // если элемент не является цифрой или буквой - пропускаем

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            // если элемент не является цифрой или буквой - пропускаем

            if (Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false; //если элементы справа и слева не равны друг другу - значит не палиндром
            }

            left ++; //сдвигаем левый указатель вправо на 1
            right --; //сдвигаем правый указатель влево на 1

        }

        return true;
    }
}