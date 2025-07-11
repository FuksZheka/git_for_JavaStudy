package Exercism_java;
/*Introduction
Constructors

Creating an instance of a class is done by calling its constructor through the new operator. A constructor is a special type of method whose goal is to initialize a newly created instance. Constructors look like regular methods, but without a return type and with a name that matches the class's name.

class Library {
    private int books;

    public Library() {
        // Initialize the books field
        this.books = 10;
    }
}

// This will call the constructor
var library = new Library();

Like regular methods, constructors can have parameters. Constructor parameters are usually stored as (private) fields to be accessed later, or else used in some one-off calculation. Arguments can be passed to constructors just like passing arguments to regular methods.

class Building {
    private int numberOfStories;
    private int totalHeight;

    public Building(int numberOfStories, double storyHeight) {
        this.numberOfStories = numberOfStories;
        this.totalHeight = numberOfStories * storyHeight;
    }
}

// Call a constructor with two arguments
var largeBuilding = new Building(55, 6.2);

Instructions

In this exercise, you'll be organizing races between various types of remote controlled cars. Each car has its own speed and battery drain characteristics.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers the car's speed in meters and decreases the remaining battery percentage by its battery drain.

If a car's battery is below its battery drain percentage, you can't drive the car anymore.

Each race track has its own distance. Cars are tested by checking if they can finish the track without running out of battery.

You have six tasks, each of which will work with remote controlled car instances.
*/
public class ex9_NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int battery = 100;

    //Task 1
    ex9_NeedForSpeed (int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public int distanceDriven(){
        return distanceDriven;
    }

    public boolean batteryDrained(){
        return battery < batteryDrain;
    }

    public void drive(){
        if(!batteryDrained()){
            distanceDriven +=speed;
            battery-=batteryDrain;
        };
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
    public int getSpeed(){
        return speed;
    }

    public static ex9_NeedForSpeed nitro(){
        return new ex9_NeedForSpeed(50,4);
    }

}

class RaceTrack{
    int distance;
    RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean canFinishRace(ex9_NeedForSpeed car){
        int maxDistance = (100/ car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
    }

    public static void main(String[] args) {
        var car = new ex9_NeedForSpeed(5,2);
        var race1 = new RaceTrack(100);
        var race2 = new RaceTrack(300);
        System.out.println(race1.canFinishRace(car));
        System.out.println(race2.canFinishRace(car));
    }
}

