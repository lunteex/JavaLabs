package org.example;

abstract class Bird {
    public int age;

    Bird (int age){
        this.age = age;
    }
    public abstract String fly();
    public void printInfo(){
        System.out.println(age);
    }
}