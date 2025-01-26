package org.example.CodeWarsJava.main.java.org.example;

public class AtTrainee3 {
    private static int i;
    private static int num;

    AtTrainee3(int numberOfLayers) {
        this.num = numberOfLayers;
        this.i = numberOfLayers * 2 + 2;

    }


    public static AtTrainee generatorOfDigits() {
        int counter = 0;
        int[][] base = new int[i][i];
        for (int j = 0; j < base.length; j++) {
            for (int k = 0; k < base[j].length; k++) {
                base[j][k] = 0;
            }
        }

        for (int i = 0; i < base.length; i++) {
            for (int j = 0; j < base[i].length; j++) {

                if (i == counter) {
                    base[i][j] = num - i;
                } else if (j == counter) {
                    base[i][j] = num - j;
                } else if (i == num - counter) {
                    base[i][j] = num - i;
                } else if (j == num - counter) {
                    base[i][j] = num - j;
                }
                counter++;
            }
        }
        return null;
    }
}
