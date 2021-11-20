package com.gitlab.qaguru;

public class Main {
    public static void main(String[] args) {

        //создание объекта с дефолтными
        Human human = new Human();
        human.name = "John";
        human.age = 24;
        human.height = 179;
        human.getWeight();
        human.sayName();
        human.sayAge();
        human.sayWeightHeight();
        //вызов статического метода
        Human.sayCommonName();

        //создание объекта спараметрами
        Human humanParametrised = new Human(10, 90, 5, "Petro");
        humanParametrised.sayName();
        humanParametrised.sayAge();
        humanParametrised.sayWeightHeight();
        //вызов статического метода
        Human.sayCommonName();

        //получение изменение данных геттером
        Human humanWeight = new Human();
        System.out.println("Вес полученный геттером " + humanWeight.getWeight());
        System.out.println("Вес измененный сеттером " + humanWeight.setWeight(123));

        //создание объекта вложенного класса и вызом его метода
        Human.PassportData passportData = new Human.PassportData();
        passportData.showPassport();

        //взаимодействие с данными, методами объекта класса
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

