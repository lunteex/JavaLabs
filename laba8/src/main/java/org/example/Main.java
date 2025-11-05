package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bird birdSparrow = new Sparrow();
        Bird birdEagle = new Eagle();

        System.out.println(birdSparrow.Fly());
        System.out.println(birdEagle.Fly());
    }
}
