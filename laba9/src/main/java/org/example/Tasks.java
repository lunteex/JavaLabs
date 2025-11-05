package org.example;

import java.util.*;

public class Tasks {


    abstract static class Employee {
        protected String id;
        protected String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public abstract double getAverageMonthlySalary();
    }

    static class FixedSalaryEmployee extends Employee {
        private double monthlySalary;

        public FixedSalaryEmployee(String id, String name, double monthlySalary) {
            super(id, name);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double getAverageMonthlySalary() {
            return monthlySalary;
        }
    }

    static class HourlyEmployee extends Employee {
        private final double hourlyRate = 5.0;
        private final double hoursPerMonth = 20.8 * 8;

        public HourlyEmployee(String id, String name) {
            super(id, name);
        }

        @Override
        public double getAverageMonthlySalary() {
            return hourlyRate * hoursPerMonth;
        }
    }

    private static final List<Employee> employees = new ArrayList<>();


    public static void task1() {
        String str = "I like Java!!!";
        System.out.println("Индекс 'Java': " + str.indexOf("Java"));
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        if (str.length() % 2 == 0) {
            int mid = str.length() / 2;
            System.out.println("Два средних символа: " + str.substring(mid - 1, mid + 1));
        } else {
            System.out.println("Ошибка: длина должна быть чётной");
        }
    }

    public static void task3() {
        class LocalEmployee {
            String fullname;
            double salary;
            LocalEmployee(String fullname, double salary) {
                this.fullname = fullname;
                this.salary = salary;
            }
        }

        class Report {
            static void generateReport(LocalEmployee[] staff) {
                System.out.println("Отчёт по зарплатам:");
                for (LocalEmployee e : staff) {
                    System.out.printf("%-15s | %10.2f%n", e.fullname, e.salary);
                }
            }
        }

        LocalEmployee[] staff = {
                new LocalEmployee("Лепеш Максим", 55000.555555555),
                new LocalEmployee("Сухой Илья", 72000.75),
                new LocalEmployee("Радевик Роман", 48000.0)
        };
        Report.generateReport(staff);
    }

    public static void task4() {
        String input = "aAXa aeffa aGha aza ax23a a3sSa";
        String[] words = input.split(" ");
        System.out.println("Подходящие строки (a...a):");
        for (String w : words) {
            if (w.matches("a[a-z]+a")) {
                System.out.println(w);
            }
        }
    }

    public static void task5() {
        String s = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String[] words = s.split("\\s+");
        System.out.println("Цифровые палиндромы:");
        for (String w : words) {
            if (w.matches("\\d+")) {
                String rev = new StringBuilder(w).reverse().toString();
                if (w.equals(rev)) {
                    System.out.println(w);
                }
            }
        }
    }

    public static void task6() {
        employees.clear();
        employees.add(new FixedSalaryEmployee("001", "Иванов Иван", 70000));
        employees.add(new FixedSalaryEmployee("002", "Петров Пётр", 65000));
        employees.add(new FixedSalaryEmployee("003", "Сидоров Сидор", 70000));
        employees.add(new HourlyEmployee("004", "Козлов Алексей"));
        employees.add(new HourlyEmployee("005", "Волков Дмитрий"));
        employees.add(new HourlyEmployee("006", "Соколов Сергей"));
        employees.add(new FixedSalaryEmployee("007", "Михайлов Стас", 80000));
        employees.add(new HourlyEmployee("008", "Басков Николай"));

        employees.sort((e1, e2) -> {
            double s1 = e1.getAverageMonthlySalary();
            double s2 = e2.getAverageMonthlySalary();
            if (Double.compare(s1, s2) != 0) {
                return Double.compare(s1, s2);
            }
            return e1.getName().compareTo(e2.getName());
        });

        System.out.println("Сотрудники (по убыванию зарплаты):");
        for (Employee e : employees) {
            System.out.printf("ID: %s, Имя: %-15s, Зарплата: %.2f%n",
                    e.getId(), e.getName(), e.getAverageMonthlySalary());
        }
    }

    public static void task7() {
        if (employees.isEmpty()) {
            System.out.println("Сначала выполните задание 6!");
            return;
        }
        System.out.println("Первые 5 имён:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            System.out.println((i + 1) + ". " + employees.get(i).getName());
        }
    }

    public static void task8() {
        if (employees.isEmpty()) {
            System.out.println("Сначала выполните задание 6!");
            return;
        }
        System.out.println("Последние 3 ID:");
        int n = employees.size();
        for (int i = Math.max(0, n - 3); i < n; i++) {
            System.out.println((i - n + 4) + ". " + employees.get(i).getId());
        }
    }
}
