package org.example;

public class Guitar extends MusicalInstrument{
    Guitar(String name)
    {
        super(name);
    }
    @Override
    public void play() {
        System.out.println("Играет гитара...");
    }

}
