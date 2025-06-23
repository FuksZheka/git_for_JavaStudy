package org.example.Exercism_java;

public class Lasagna_ex2 {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    };
    public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    };
    public int preparationTimeInMinutes(int x) {
        return x * PREPARATION_TIME_PER_LAYER;
    };
    public int totalTimeInMinutes(int x, int y) {
        return preparationTimeInMinutes(x) + y;
    }
}