package Exercism_java.ex_Secrets;

public class Secrets {


    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask; // Битовое или
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask; // Битовое исключающее ИЛИ
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask; // Логическое битовое "И" а также инверсия на второе значение.
    }

    public static void main(String[] args) {

        System.out.println(Secrets.shiftBack(8, 2));

        System.out.println(Secrets.shiftBack(-2_144_333_657, 3));
    }
}
