package com.example.domain;

public class Manager extends Sotrudnik {
    private int teamSize;

    public Manager(String department, String position, int experience, int teamSize) {
        super (department, position,experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
