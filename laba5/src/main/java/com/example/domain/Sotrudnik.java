package com.example.domain;

public class Sotrudnik {
    private String department;
    private String position;
    private int experience;

    public Sotrudnik(String department, String position, int experience) {
        this.department = department;
        this.position = position;
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
