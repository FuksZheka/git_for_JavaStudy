package org.example.Exercism_java;

public class ex11_Cars_assemble {
    int baseProductionRate = 221;
    double quality;

    public static double productionRatePerHour(int speed) {
        int baseProductionRate = 221;
        double quality;

        if (speed >= 1 && speed <= 4) {
            quality = 1;
        } else if (speed >= 5 && speed <= 8) {
            quality = 0.9;
        } else if (speed == 9) {
            quality = 0.8;
        } else quality = 0.77;
        return speed * baseProductionRate * quality;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / (60));
    }

    public static void main(String[] args) {
        System.out.println(productionRatePerHour(4));
    }
}
