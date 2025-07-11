package Exercism_java;

public class ex_15_FootballMatchReport {
    public static String onField(int shirtNum) {
        String position;
        switch (shirtNum) {
            case 1 -> position = "goalie";
            case 2 -> position = "left back";
            case 4, 3 -> position = "center back";
            case 5 -> position = "right back";
            case 6, 7, 8 -> position = "midfielder";
            case 9 -> position = "left wing";
            case 10 -> position = "striker";
            case 11 -> position = "right wing";
            default -> throw new IllegalArgumentException("Unexpected value: " + shirtNum);
        }
        return position;
    }
    private static String onField2(int shirtNum){
        String position = "";
        switch (shirtNum){
            case 1:
                position = "goalie";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shirtNum);
        }
        return position;
    }
}