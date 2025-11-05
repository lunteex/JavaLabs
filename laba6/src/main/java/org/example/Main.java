package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: Геккон ===");
        Gecko gecko1 = new Gecko("Саша", 5, "Синий");
        Gecko gecko2 = new Gecko("Дима", 2, "Коричневый");

        System.out.println("Геккон "+ gecko1.getName() + ", цвет: " + gecko1.color);
        gecko1.sayHello();
        gecko1.goToSleep();

        System.out.println("Геккон "+ gecko2.getName() + ", цвет: " + gecko2.color);
        gecko2.sayHello();
        gecko2.eat();

        System.out.println("\n=== Задание 2: Дерево ===");
        Tree tree = new Tree();
        tree.bloom();
        tree.turnYellow();
        tree.shedLeaves();
        tree.coverWithFrost();
    }
}