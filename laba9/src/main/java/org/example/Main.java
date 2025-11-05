package org.example;

import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, MusicalInstrument> instrumentMap = new HashMap<>();

        instrumentMap.put("Гитара", new Guitar("Гитара1"));
        instrumentMap.put("Пианино", new Piano("Пианино1"));
        Set<String> keys = instrumentMap.keySet();

        System.out.println("Задание 1");
        System.out.println(keys);
        System.out.println(instrumentMap);
        System.out.println("Задание 2");
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Новик Никита", "Т-319", 2);
        s1.addGrade("Математика", 4);
        s1.addGrade("Программирование", 3);
        s1.addGrade("Физика", 2);

        Student s2 = new Student("Сухой Илья", "Т-319", 2);
        s2.addGrade("Математика", 5);
        s2.addGrade("Программирование", 5);
        s2.addGrade("Физика", 4);

        Student s3 = new Student("Лионель Месси", "Т-228", 2);
        s3.addGrade("Математика", 2);
        s3.addGrade("КПиЯП", 2);
        s3.addGrade("ТРПО", 2);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Исходный список студентов:");
        students.forEach(System.out::println);

        StudentManager.promoteStudents(students);
        StudentManager.printStudents(students, 3);

        System.out.println("\nОставшиеся студенты:");
        students.forEach(System.out::println);

        Scanner in = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Ваш выбор: ");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> Tasks.task1();
                case 2 -> Tasks.task2();
                case 3 -> Tasks.task3();
                case 4 -> Tasks.task4();
                case 5 -> Tasks.task5();
                case 6 -> Tasks.task6();
                case 7 -> Tasks.task7();
                case 8 -> Tasks.task8();
                case 0 -> System.out.println("Выход из программы...");
                default -> System.out.println("Неверный выбор!");
            }
        } while (choice != 0);
    }

    private static void printMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("               МЕНЮ ЗАДАНИЙ");
        System.out.println("=".repeat(50));
        System.out.println("1 - Найти индекс 'Java'");
        System.out.println("2 - Два средних символа строки");
        System.out.println("3 - Отчёт по зарплатам");
        System.out.println("4 - Строки вида a...a");
        System.out.println("5 - Цифровые палиндромы");
        System.out.println("6 - Сортировка сотрудников по зарплате");
        System.out.println("7 - Первые 5 имён");
        System.out.println("8 - Последние 3 ID");
        System.out.println("0 - Выход");
    }
}
