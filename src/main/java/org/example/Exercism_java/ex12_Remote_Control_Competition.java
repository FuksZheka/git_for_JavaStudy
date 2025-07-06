package org.example.Exercism_java;

interface RemoteControlCar {
    void drive();
    int DistanceTravelled();
}

public class ex12_Remote_Control_Competition implements RemoteControlCar{
    private int distanceTravelled;
    private int numberOfVictories;

    @Override
    public void drive() {
        distanceTravelled += 10;
    }

    @Override
    public int DistanceTravelled() {
        return distanceTravelled;
    }
}

