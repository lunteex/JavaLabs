package org.example;
public class Main {
    public static void main(String[] args) {
        Sparrow birdSparrow = new Sparrow(13);
        Eagle birdEagle = new Eagle(12);

        System.out.println(birdSparrow.fly());
        System.out.println(birdEagle.fly());

    }
}