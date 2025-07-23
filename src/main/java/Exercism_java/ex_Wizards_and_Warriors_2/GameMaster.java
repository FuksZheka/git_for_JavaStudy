package Exercism_java.ex_Wizards_and_Warriors_2;

public class GameMaster {

    public String describe(Character character) {
        int level = character.getLevel();
        String characterClass = character.getCharacterClass();
        int hpBar = character.getHitPoints();
        return String.format("You're a level %d %s with %d hit points.", level, characterClass, hpBar);

    }


    public String describe(Destination destination) {
        String name = destination.getName();
        int inhabits = destination.getInhabitants();
        return String.format("You've arrived at %s, which has %d inhabitants.", name, inhabits);
    }

    public String describe(TravelMethod travelMethod) {
        String travelMethod_toString = travelMethod.toString().toLowerCase();
        if (travelMethod == TravelMethod.HORSEBACK) {
            travelMethod_toString = "on " + travelMethod_toString;
        } else if (travelMethod == TravelMethod.WALKING) {
            travelMethod_toString = "by " + travelMethod_toString;
        }
        return String.format("You're traveling to your destination %s.", travelMethod_toString);
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
