package com.racing.demo;

public class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed = Math.max(0, speed - 4);
    }
}

