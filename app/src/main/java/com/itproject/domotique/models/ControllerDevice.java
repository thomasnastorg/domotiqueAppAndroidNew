package com.itproject.domotique.models;

public class ControllerDevice {
    private double id;
    private String name;
    private String room;



    public ControllerDevice(double id,String name) {
        this.id = id;
        this.name = name;

    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
