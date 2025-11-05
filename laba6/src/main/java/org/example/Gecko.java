package org.example;

public class Gecko {
    private String name;
    protected int age;
    public String color;
    private boolean isHungry;

    public Gecko() {
        this.name = "Без имени";
        this.age = 1;
        this.color = "Зелёный";
        this.isHungry = true;
    }

    public Gecko(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHungry = false;
    }

    public void sayHello() {
        System.out.println("Геккон " + name + " говорит: Привет!");
    }

    protected void eat() {
        if (isHungry) {
            System.out.println(name + " ест насекомых.");
            isHungry = false;
        } else {
            System.out.println(name + " не голоден.");
        }
    }

    public String getName() {
        return name;
    }

    private void sleep() {
        System.out.println(name + " спит.");
    }

    public void goToSleep() {
        sleep();
    }
}