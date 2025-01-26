package org.example.switch_operator;

import java.util.Scanner;

/**
 * Вася работает программистом и получает 50 долл. США за каждые 100 строк кода (за последние строки, которые не дотягивают до сотни, он не получает ничего). Т.е. за 99 строк он получит 0, за 199  строк получит 50, и т.д.
 * <p>
 * За каждое третье опоздание Васю штрафуют на 20 долл. США.
 * <p>
 * Программа должна реализовать три варианта расчетов:
 * <p>
 * 1) Пользователь вводит желаемый доход Васи и количество опозданий. Подсчитать, сколько строк кода (минимально) ему нужно написать, чтобы получить сумму не менее желаемого.
 * <p>
 * 2) Пользователь вводит количество строк кода, написанное Васей, и желаемый объем зарплаты. Подсчитать сколько раз Вася может опоздать (максимально). Если даже без опозданий желаемую  зарплату он не получит, вывести "ERROR".
 * <p>
 * 3) Пользователь вводит количество строк кода и количество опозданий. Определить, сколько заплатят Васе. Если не заплатят вообще, то вывести 0.
 * <p>
 * Сначала пользователь вводит номер варианта расчета, а потом два числа в соответствии с условием варианта (все числа целые). Например: 1 1000 4   означает первый вариант расчета, 1000 - желаемый доход, 4 - количество опозданий. Ответом должно быть минимальное количество строк кода, которое нужно написать.
 * <p>
 * Если первое число, которое вводит пользователь, не равно 1, 2 или 3 (вариант расчета), то вывести "ERROR".
 */

public class Task224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculate_mode = scanner.nextInt();
        int desired_value, counter_of_delay, counter_of_lines;

//        int desired_value = scanner.nextInt();
//        int counter_of_delay = scanner.nextInt();
        switch (calculate_mode) {
            case 1:
                desired_value = scanner.nextInt();
                counter_of_delay = scanner.nextInt();
                counter_of_delay = (counter_of_delay / 3);
                counter_of_lines = (desired_value + (counter_of_delay * 20)) * 100 / 50;
                double counter_of_lines2 = Math.ceil((double) counter_of_lines / 100) * 100;
                System.out.println((int) counter_of_lines2);
                break;
            case 2:
                counter_of_lines = scanner.nextInt();
                desired_value = scanner.nextInt();
                int delayed_value = ((counter_of_lines - counter_of_lines % 100) / 100 * 50) - desired_value;
                double counter_of_spisniy = Math.floor(delayed_value / 20);
                counter_of_delay = (int) (counter_of_spisniy * 3 + 2);
                if (counter_of_delay <= 2) {
                    System.out.println("ERROR");
                    break;
                } else {
                    System.out.println(counter_of_delay);
                    break;
                }
            case 3:
                counter_of_lines = scanner.nextInt();
                counter_of_delay = scanner.nextInt();
                desired_value = (counter_of_lines / 100) * 50 - (counter_of_delay / 3) * 20;
                if (desired_value < 0) {
                    desired_value = 0;
                }
                System.out.println(desired_value);
                break;

            default:
                System.out.println("ERROR");
        }
    }

}
