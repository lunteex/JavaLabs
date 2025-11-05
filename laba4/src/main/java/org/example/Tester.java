package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Средний", 1000.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void greet() {
        System.out.println("Здравствуйте, я " + name + " " + surname);
    }

    public void greet(String language) {
        System.out.println("Приветствие на " + language + ": Здравствуйте, я " + name);
    }

    public void greet(boolean showEnglishLevel) {
        if (showEnglishLevel) {
            System.out.println("Уровень английского: " + englishLevel);
        } else {
            greet();
        }
    }

    public static void compareSalary(Tester t1, Tester t2) {
        if (t1.salary > t2.salary) {
            System.out.println(t1.name + " зарабатывает больше, чем " + t2.name);
        } else if (t1.salary < t2.salary) {
            System.out.println(t2.name + " зарабатывает больше, чем " + t1.name);
        } else {
            System.out.println("Они зарабатывают одинаково.");
        }
    }
}
