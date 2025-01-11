package org.example.CodeWarsJava.main.java.org.example;

public class BinaryAddition {
    int firstnumber;
    int secondNumber;

    public BinaryAddition(int a, int b) {
        this.firstnumber = a;
        this.secondNumber = b;
    }

    public String binnaryAddition() {

        int sum = firstnumber + secondNumber;
        String convert = Long.toBinaryString(sum);
        return convert;
    }

}
