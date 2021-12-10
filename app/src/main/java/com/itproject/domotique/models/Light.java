package com.itproject.domotique.models;

public class Light extends ControllerDevice{

    private int Red;
    private int Bleu;
    private int Grenne;
    private boolean state;


    public Light(double id, String name) {
        super(id, name);

    }
}
