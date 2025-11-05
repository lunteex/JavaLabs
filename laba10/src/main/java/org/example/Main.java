package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Тестирование системы ===\n");

        System.out.println("1. Проверка отрицательного оклада:");
        try {
            Employee bad = new StaffMember("Иванов", "Бухгалтер", -5000, 1000);
        }
        catch (OkladException e) {
            System.out.println(e.getMessage());
            try { throw e; }
            catch (OkladException ex) {
                System.out.println("→ Исключение перехвачено в main!\n");
            }
        }

        System.out.println("2. Проверка отрицательной премии:");
        try {
            StaffMember staff = new StaffMember("Петров", "Менеджер", 60000, -5000);
            double salary = staff.calculateSalary();
            System.out.println("Зарплата: " + salary);
        }
        catch (OkladException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n3. Нормальные сотрудники:");
        try {
            StaffMember goodStaff = new StaffMember("Сидоров", "Программист", 70000, 15000);
            System.out.println("Штатный: " + goodStaff.calculateSalary());

            ContractEmployee contract = new ContractEmployee("Кузнецова", "Дизайнер", 80000);
            System.out.println("Контракт: " + contract.calculateSalary());
        }
        catch (OkladException e) {
            System.out.println(e.getMessage());
        }
    }
}