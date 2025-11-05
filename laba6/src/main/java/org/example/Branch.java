package org.example;

public class Branch {
    public Leaf[] leaves;

    public Branch() {
        leaves = new Leaf[2];

        for (int i = 0; i < leaves.length; i++) {
            leaves[i] = new Leaf();
        }
    }
}