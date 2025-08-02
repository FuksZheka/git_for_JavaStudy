package Exercism_java.ex_DnDCharacter;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitPoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());

        this.hitPoints = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> newList = new ArrayList<>(scores);
        // Sort the scores in ascending order
        Collections.sort(newList);
        // Sum the highest 3 dice (last 3 elements after sorting)
        return newList.get(1) + newList.get(2) + newList.get(3);
    }

    List<Integer> rollDice() {
        Random random = new Random();
        List<Integer> rolls = new ArrayList<>();
        // Roll 4 six-sided dice
        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1); // 1-6 inclusive
        }
        return rolls;
    }

    int modifier(int input) {

        // Calculate modifier: (constitution - 10) / 2 rounded down
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitPoints() {
        return hitPoints;
    }
}
