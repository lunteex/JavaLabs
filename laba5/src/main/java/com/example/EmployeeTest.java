package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Криштиану Роналду");
        emp.setSalary(120_345.27);
        emp.setSsn("012345678");

        System.out.println("ID Сотрудника: " + emp.getEmpId());
        System.out.println("Имя сотрудника: " + emp.getName());
        System.out.println("Номер социального страхования сотрудника: " + emp.getSsn());
        System.out.println("Зарплата сотрудника: " + emp.getSalary());
    }
}
