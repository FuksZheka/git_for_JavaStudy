package Exercism_java.ResistorColor;

import java.math.BigInteger;

public class ResistorColorTrio {
    String ResistorDigits;

    String label(String[] colors) {
        String temp = "";
        for (int i = 0; i < 2; i++) {

            switch (colors[i]) {
                case "black" -> temp += 0;
                case "brown" -> temp += "1";
                case "red" -> temp += "2";
                case "orange" -> temp += "3";
                case "yellow" -> temp += "4";
                case "green" -> temp += "5";
                case "blue" -> temp += "6";
                case "violet" -> temp += "7";
                case "grey" -> temp += "8";
                case "white" -> temp += "9";
                default -> throw new IllegalStateException("Unexpected value: " + colors[0]);
            }
            ResistorDigits = temp;
        }

        switch (colors[2]) {
            case "black" -> ResistorDigits += "";
            case "brown" -> ResistorDigits += "0";
            case "red" -> ResistorDigits += "00";
            case "orange" -> ResistorDigits += "000";
            case "yellow" -> ResistorDigits += "0000";
            case "green" -> ResistorDigits += "00000";
            case "blue" -> ResistorDigits += "000000";
            case "violet" -> ResistorDigits += "0000000";
            case "grey" -> ResistorDigits += "00000000";
            case "white" -> ResistorDigits += "000000000";
            default -> throw new IllegalStateException("Unexpected value: " + colors[0]);

        }


        long intResistorDigits = Long.parseLong(ResistorDigits);

        if (intResistorDigits < 1000) {
            return intResistorDigits + " ohms";
        } else if (intResistorDigits < 1000000) {
            return intResistorDigits / 1000 + " kiloohms";
        } else if (intResistorDigits < 1000000000) {
            return intResistorDigits / 1000000 + " megaohms";
        } else if (intResistorDigits > 1000000000){
            return intResistorDigits / 1000000000 + " gigaohms";
        }
        return null;
    }

    public static void main(String[] args) {
        ResistorColorTrio resistorColorTrio = new ResistorColorTrio();
        System.out.println(resistorColorTrio.label(new String[] { "white", "white", "white" }));
    }
}
