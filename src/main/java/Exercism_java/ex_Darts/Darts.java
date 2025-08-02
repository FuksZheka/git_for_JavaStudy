package Exercism_java.ex_Darts;

public class Darts {
    int score(double xOfDart, double yOfDart) {
        double a = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if (Math.sqrt(a)>10){
            return 0;
        }
        else if (Math.sqrt(a)>5){
            return 1;
        } else if (Math.sqrt(a)>1) {
            return 5;
        } else if (Math.sqrt(a)<=1) {
            return 10;
        }

        return 0;
    }

/*
* внутренний радиус - 1
* внешний радиус 10
* средний радиус - 5
*
*
*
*
*
* */
}
