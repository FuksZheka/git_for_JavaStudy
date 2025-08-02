package Exercism_java.ResistorColor;

public class ResistorColorDuo {

    int value(String[] colors) {
        String temp;
            switch (colors[0]) {
                case "black" -> {
                    temp = "0";
                }
                case "brown" -> {
                    temp = "1";
                }
                case "red" -> {
                    temp = "2";
                }
                case "orange" -> {
                    temp = "3";
                }
                case "yellow" -> {
                    temp = "4";
                }
                case "green" -> {
                    temp = "5";
                }
                case "blue" -> {
                    temp = "6";
                }
                case "violet" -> {
                    temp = "7";
                }
                case "grey" -> {
                    temp = "8";
                }
                case "white" -> {
                    temp = "9";
                }
                default -> throw new IllegalStateException("Unexpected value: " + colors[0]);
            }
        switch (colors[1]) {
            case "black" -> {
                temp += 0;
            }
            case "brown" -> {
                temp += "1";
            }
            case "red" -> {
                temp += "2";
            }
            case "orange" -> {
                temp += "3";
            }
            case "yellow" -> {
                temp += "4";
            }
            case "green" -> {
                temp += "5";
            }
            case "blue" -> {
                temp += "6";
            }
            case "violet" -> {
                temp += "7";
            }
            case "grey" -> {
                temp += "8";
            }
            case "white" -> {
                temp += "9";
            }
            default -> throw new IllegalStateException("Unexpected value: " + colors[0]);
        }
        return Integer.parseInt(temp);
    }

}
