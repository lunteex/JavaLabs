package org.example;

public class StaffMember extends Employee{
    private double bonus;

    public StaffMember (String fullName, String position, double salary, double bonus) throws OkladException{
        super(fullName, position, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new PremiyaException("Премия не может быть отрицательной!");
            }
            return getSalary() + bonus;
        }
        catch (PremiyaException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return getSalary();
        }
        catch (Exception e) {
            System.out.println("Другая ошибка при расчёте зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
