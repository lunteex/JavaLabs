package org.example;

public class Department {
    private String name;
    private int employeeNumber;

    public Department (String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
}
