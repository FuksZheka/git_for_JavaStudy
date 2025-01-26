package org.example.CodeWarsJava.main.java.org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaMagics {
    public static void randomizer() {
        Random random = new Random();
        String str = "";
        int integerof = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerof = random.nextInt(0, 15);
            list.add(integerof);

        }
        str = String.join(" ", String.valueOf(list.get(0)), String.valueOf(list.get(1)),
                String.valueOf(list.get(2)), String.valueOf(list.get(3)), String.valueOf(list.get(4)));
        System.out.println(str);
    }
}
