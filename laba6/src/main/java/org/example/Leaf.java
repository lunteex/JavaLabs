package org.example;

public class Leaf {
    private String color;

    public Leaf() {
        this.color = "Зелёный";
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void fall() {
        System.out.println("Лист падает с дерева.");
    }
}