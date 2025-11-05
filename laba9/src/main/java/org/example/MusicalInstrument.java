package org.example;

public abstract class MusicalInstrument {
    public String name;

    public MusicalInstrument (String name){
        this.name = name;
    }

    public abstract void play();
    @Override
    public String toString(){
        return name;
    }
}