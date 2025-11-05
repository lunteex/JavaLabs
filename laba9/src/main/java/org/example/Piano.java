package org.example;

public class Piano extends MusicalInstrument{
    public Piano(String name)
    {
        super(name);
    }
    @Override
    public void play(){
        System.out.println("Играет пианино...");
    }
}
