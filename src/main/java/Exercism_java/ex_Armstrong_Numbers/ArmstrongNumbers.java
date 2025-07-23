package Exercism_java.ex_Armstrong_Numbers;

import java.util.ArrayList;
import java.util.List;


class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int result = 0;

        List<Integer> digits = new ArrayList<>();

        int number = numberToCheck;
        while (number > 0) {
            digits.add(0, number % 10); // Добавляем в начало списка
            number /= 10;
        }

        if (!digits.isEmpty()) {
            for (int i = 0; i < digits.size(); i++) {
                result += (int) Math.pow(digits.get(i), digits.size());
            }
        }

        return result == numberToCheck;

    }

    public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

        System.out.println(armstrongNumbers.isArmstrongNumber(153));
    }
}
