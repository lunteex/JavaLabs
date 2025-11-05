package org.example;

public abstract class Employee {

    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) throws OkladException {
        if (salary < 0) {
            throw new OkladException(salary);
        }
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public abstract double calculateSalary();
}
