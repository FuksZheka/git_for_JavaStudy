package Exercism_java.ex_leap;

class Leap {

    boolean isLeapYear(int year) {
        return ((year % 4) == 0) && ((year % 100) != 0) || (year % 400 == 0);
    }

    boolean isLeapYear2 (int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 != 0){
            return true;
        } else return year %400 == 0;

    }

    public static void main(String[] args) {
        Leap leap = new Leap();
        System.out.println(leap.isLeapYear(1996));
    }
}
