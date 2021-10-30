package com.gitlab.qaguru;

public class Car {
    double fuelConsumption;
    double tankCapacity;

    double canDriveDistance () {
        return tankCapacity/fuelConsumption*100;
    }
}
