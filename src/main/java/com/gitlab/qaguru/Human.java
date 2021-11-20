package com.gitlab.qaguru;

public class Human {

    //непараметризованный конструктор класса
    public Human() {

        this.name = null;
        this.age = 0;
        this.weight = 3;
        this.height = 40;
    }

    //параметризованный конструктор класса
    public Human(int weight, int height, int age, String name) {

        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
    }

    String name;
    int age;
    int weight;
    int height;
    static String commonName = "Человек";

    //геттер
    public int getWeight() {
        return weight;
    }

    //сеттер
    public int setWeight(int weight) {
        return this.weight = weight;
    }

    //вложенный статический класс
    static class PassportData {
        String series = "GT";
        String number = "500";

        void showPassport() {
            System.out.println("My passport is " + series + number);
        }
    }

    void sayName() {
        System.out.println("My name is " + name);
    }

    void sayAge() {
        System.out.println("My age is " + age);
    }

    void sayWeightHeight() {
        System.out.println("My weight and height are " + weight + " and " + height);
    }

    static void sayCommonName() {
        System.out.println(commonName);
    }

}
