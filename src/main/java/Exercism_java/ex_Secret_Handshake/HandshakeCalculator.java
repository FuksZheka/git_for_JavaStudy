package Exercism_java.ex_Secret_Handshake;
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalсulator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> resultList = new ArrayList<>();

        number = Math.min(number, 31);

        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(number));
        for (int i = binaryString.length(); i <= 4; i++) {
         binaryString.insert(0, '0');
        }

        char one = binaryString.charAt(0);
        char two = binaryString.charAt(1);
        char three = binaryString.charAt(2);
        char four = binaryString.charAt(3);
        char five = binaryString.charAt(4);
        if (five == '1') {
            resultList.add(Signal.WINK);
        }
        if (four == '1') {
            resultList.add(Signal.DOUBLE_BLINK);
        }
        if (three == '1') {
            resultList.add(Signal.CLOSE_YOUR_EYES);
        }
        if (two == '1') {
            resultList.add(Signal.JUMP);
        }
        if (one == '1') {
            resultList = resultList.reversed();
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        HandshakeCalсulator handshakeCalulator = new HandshakeCalсulator();
        System.out.println(handshakeCalulator.calculateHandshake(1));

        /*System.out.println((Integer.toBinaryString(24)));
        int one = Integer.toBinaryString(24).charAt(0);
        System.out.println(one+1);*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {
    public List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();

        // Check each bit from right to left
        if ((number & 0b00001) != 0) handshake.add(Signal.WINK);
        if ((number & 0b00010) != 0) handshake.add(Signal.DOUBLE_BLINK);
        if ((number & 0b00100) != 0) handshake.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 0b01000) != 0) handshake.add(Signal.JUMP);

        // Check if we need to reverse the order
        if ((number & 0b10000) != 0) Collections.reverse(handshake);

        return handshake;
    }
}