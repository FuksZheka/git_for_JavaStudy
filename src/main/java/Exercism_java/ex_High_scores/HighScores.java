package Exercism_java.ex_High_scores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighScores {

    public List<Integer> ListHigh;

    public HighScores(List<Integer> highScores) {
        this.ListHigh = highScores;
    }

    List<Integer> scores() {
        return ListHigh;
    }

    Integer latest() {
        return this.ListHigh.getLast();
    }

    Integer personalBest() {
        List <Integer> tempList = new ArrayList<>(scores());
        tempList.sort(Comparator.reverseOrder());
        return tempList.getFirst();
    }

    List<Integer> personalTopThree() {
        List <Integer> tempList = new ArrayList<>(scores());
        tempList.sort(Comparator.reverseOrder());
        if (tempList.size() < 3) return tempList;
        else  return tempList.subList(0, 3);
    }

    public static void main(String[] args) {
        HighScores highScores = new HighScores(Arrays.asList(70, 50, 20, 30));
        highScores.personalTopThree();
        System.out.println(highScores.latest());
    }
}
