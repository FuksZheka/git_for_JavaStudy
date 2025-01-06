package org.example.algorithm_construct;
import java.util.Arrays;
import java.util.Scanner;


public class Task215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] team_1_marks = new int[2],team_2_marks = new int[4];
        for (int i = 0; i < team_1_marks.length; i++) {
            team_1_marks[i] = scanner.nextInt();
        }
        for (int j = 0; j < team_2_marks.length; j++) {
            team_2_marks[j] = scanner.nextInt();
        }
        double team_1_average = (double) Arrays.stream(team_1_marks).sum() / team_1_marks.length;
        double team_2_average = (double) Arrays.stream(team_2_marks).sum() / team_2_marks.length;
        if (team_1_average > team_2_average){
            System.out.println("First");
        } else if (team_1_average == team_2_average) {
            System.out.println("Draw");
        } else if (team_1_average < team_2_average){
            System.out.println("Second");
        }

    }
}
