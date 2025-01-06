package org.example.algorithm_construct;
import java.util.Locale;
import java.util.Scanner;

import java.util.Locale;
/**
 * Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В. Емкость бака для топлива у самолета – 300 литров. В точке А бак заправляют полностью. Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:
 *
 *           - до 500 кг (включительно) :    1 литров / км
 *
 *           - до 1000 кг (включительно):   4 литров / км
 *
 *           - до 1500 кг (включительно):   7 литров / км
 *
 *           - до 2000 кг (включительно):   9 литров / км.
 *
 *           - более 2000 кг – самолет не поднимает.
 *
 * Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С, а также вес груза. Программа должна рассчитать какое минимальное количество топлива необходимо для дозаправки самолету в пункте В, чтобы долететь из пункта А в пункт С. В случае невозможности преодолеть любое из расстояний – программа должна вывести ERROR.
 *
 * Числовой результат работы программы округляется до двух знаков после десятичной точки.
 */
public class Task218 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int distance_AB, distance_BC,cargo_weight, cost,fuel_tank;

        double final_cost;
        cost = 0;
        fuel_tank = 300;
        distance_AB = scanner.nextInt();
        distance_BC = scanner.nextInt();
        cargo_weight = scanner.nextInt();
        if (cargo_weight <= 500){
            cost = 1;
        } else if (cargo_weight > 500 && cargo_weight <= 1000 ) {
            cost = 4;
        } else if (cargo_weight > 1000 && cargo_weight <= 1500) {
            cost = 7;
        } else if (cargo_weight > 1500 && cargo_weight <= 2000) {
            cost = 9;
        } else if (cargo_weight > 2000){
            System.out.println("ERROR");
            return;
        }
        double fuel_AB, fuel_BC,refill;
        fuel_AB = (double) distance_AB * cost;

        final_cost = (double) (distance_AB + distance_BC) * cost;
        fuel_BC = final_cost - fuel_AB;
        refill = final_cost - fuel_tank;
        if (refill < 0){
            refill = 0.0;
        }
        if (fuel_AB > fuel_tank || fuel_BC > fuel_tank){
            System.out.println("ERROR");
            return;
        } else {
            System.out.printf("%.2f",refill); /* 2 знака после запятой*/
        }
    }
}
