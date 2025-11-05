package org.example;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fullName, String position, double salary) throws OkladException{
        super(fullName, position, salary);
    }
    @Override
    public double calculateSalary() {
        try {
            return getSalary() * 1.20;
        }
        catch (Exception e) {
            System.out.println("Ошибка у контрактника: " + e.getMessage());
            return 0;
        }
    }
}
