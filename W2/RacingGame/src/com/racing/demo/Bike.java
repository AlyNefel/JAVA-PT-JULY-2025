package com.racing.demo;

public class Bike extends Vehicle implements Boostable {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        speed += 7;
    }

    @Override
    public void brake() {
        speed = Math.max(0, speed - 3);
    }

    @Override
    public void boost() {
        speed += 15;
    }
}
