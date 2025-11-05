package org.example;

public class Sparrow extends Bird {
    Sparrow (int age){
        super(age);
    }
    @Override
    public String fly(){
        return "Летит воробей";
    }
}
