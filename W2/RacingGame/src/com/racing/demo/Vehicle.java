package com.racing.demo;

public abstract class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
    }

    public abstract void accelerate();
    public abstract void brake();

    public String getStatus() {
        return name + " is going at " + speed + " km/h.";
    }
}