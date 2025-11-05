package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Никита!");

        Tester tester1 = new Tester("Барак", "Обама", 3, "Продвинутый", 2500.0);
        Tester tester2 = new Tester("Криштиану", "Роналду", 2, "Выше среднего", 2200.0);

        tester1.greet();
        tester1.greet("испанский");
        tester1.greet(true);

        Tester.compareSalary(tester1, tester2);
    }
}
