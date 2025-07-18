package com.racing.demo;

public class Car extends Vehicle implements Boostable {
    public Car(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        speed += 10;
    }

    @Override
    public void brake() {
        speed = Math.max(0, speed - 5);
    }

    @Override
    public void boost() {
        speed += 20;
    }
}

