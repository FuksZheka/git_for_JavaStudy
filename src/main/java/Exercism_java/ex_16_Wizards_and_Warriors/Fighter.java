package Exercism_java.ex_16_Wizards_and_Warriors;

/*Instructions

In this exercise you're playing a role-playing game where different types of fighters can combat each other. The game has different rules for each type of fighter. We are going to focus on two specific types: Wizards and Warriors.

For a Warrior, these are the rules:

    A Warrior is never vulnerable.
    A Warrior deals 6 points of damage if the fighter they are attacking is not vulnerable.
    A Warrior deals 10 points of damage if the fighter they are attacking is vulnerable.

For a Wizard, these are the rules:

    A Wizard can prepare a spell in advance.
    A Wizard is vulnerable unless they have prepared a spell in advance.
    A Wizard deals 12 points of damage if they prepared a spell in advance.
    A Wizard deals 3 points of damage if they did not prepare a spell in advance.

Create a new class called Warrior. This class should inherit from the existing Fighter class.

Update the Warrior class so that its toString() method describes what kind of fighter they are. The method should return the string "Fighter is a Warrior".

Warrior warrior = new Warrior();
warrior.toString();
// => "Fighter is a Warrior"

Update the Warrior class so that its isVulnerable() method always returns false.

Warrior warrior = new Warrior();
warrior.isVulnerable();
// => false

Update the Warrior class so that its getDamagePoints(Fighter) method calculates the damage dealt by a Warrior according to the rules above.

Warrior warrior = new Warrior();
Wizard wizard = new Wizard();

warrior.getDamagePoints(wizard);
// => 10

Update the Wizard class so that its toString() method describes what kind of fighter they are. The method should return the string "Fighter is a Wizard".

Wizard wizard = new Wizard();
wizard.toString();
// => "Fighter is a Wizard"

Update the Wizard class to add a method called prepareSpell(). The class should remember when this method is called, and make sure that its isVulnerable() method returns false only when a spell is prepared.

Wizard wizard = new Wizard();
wizard.prepareSpell();
wizard.isVulnerable();
// => false

Update the Wizard class so that its getDamagePoints(Fighter) method calculates the damage dealt by a Wizard according to the rules above.

Wizard wizard = new Wizard();
Warrior warrior = new Warrior();

wizard.prepareSpell();
wizard.getDamagePoints(warrior);
// => 12

*/
class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints;
        damagePoints = fighter.isVulnerable() ? 10 : 6;
        return damagePoints;
    }
}

class Wizard extends Fighter {
    boolean alacrityOfSpell = false;

    public String toString() {
        return "Fighter is a Wizard";
    }

    public boolean prepareSpell() {
        return this.alacrityOfSpell = true;
    }

    @Override
    boolean isVulnerable() {
        return !this.alacrityOfSpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints;
        damagePoints = this.alacrityOfSpell ? 12 : 3;
        return damagePoints;
    }
}

class Test {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        System.out.println(wizard.isVulnerable());
    }
}


// TODO: define the Warrior class

// TODO: define the Wizard class
