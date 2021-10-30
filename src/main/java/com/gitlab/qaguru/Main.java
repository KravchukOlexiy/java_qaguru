package com.gitlab.qaguru;

public class Main {
    public static void main(String[] args) {

    Human human = new Human();
    human.name = "John";
    human.age = 24;
    human.height = 179;
    human.weight = 84;
    human.sayName();
    human.sayAge();
    human.sayWeightHeight();


            Car bus = new Car();
            Car truck = new Car();

            bus.fuelConsumption = 29;
            bus.tankCapacity = 85;

            truck.fuelConsumption = 35;
            truck.tankCapacity = 120;

        System.out.println();
        System.out.println("Bus can pass distance " + bus.canDriveDistance());
        System.out.println("Truck can pass distance " + truck.canDriveDistance());
            if (bus.canDriveDistance() > truck.canDriveDistance()) {
                System.out.println("Bus won");
            } else System.out.println("Track won");

        }



    }

