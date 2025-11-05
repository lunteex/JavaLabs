package org.example;

public class Tree {
    private Branch[] branches;

    public Tree() {
        branches = new Branch[2];
        for (int i = 0; i < branches.length; i++) {
            branches[i] = new Branch();
        }
    }

    public void bloom() {
        System.out.println("Дерево цветёт!");
        for (Branch branch : branches) {
            for (int j = 0; j < branch.leaves.length; j++) {
                branch.leaves[j].setColor("Зеленый");
            }
        }
        System.out.println("Лист изменил цвет на " + branches[0].leaves[0].getColor() + ".");
    }

    public void shedLeaves() {
        System.out.println("Листья дерева опадают!");
        for (Branch branch : branches) {
            for (int j = 0; j < branch.leaves.length; j++) {
                branch.leaves[j].fall();
            }
        }
    }

    public void coverWithFrost() {
        System.out.println("Дерево покрывается инеем!");
        for (Branch branch : branches) {
            for (int j = 0; j < branch.leaves.length; j++) {
                branch.leaves[j].setColor("Серебристый");
            }
        }
        System.out.println("Лист изменил цвет на " + branches[0].leaves[0].getColor() + ".");
    }

    public void turnYellow() {
        System.out.println("Листья дерева желтеют!");
        for (Branch branch : branches) {
            for (int j = 0; j < branch.leaves.length; j++) {
                branch.leaves[j].setColor("Желтый");
            }
        }
        System.out.println("Лист изменил цвет на " + branches[0].leaves[0].getColor() + ".");
    }
}