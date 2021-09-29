package com.company;

public class Bus extends Transport implements ITransport{

    private int wheels;
    private Driver driver;

    public Bus() {
    }

    public Bus(int wheels, Driver driver) {
        this.wheels = wheels;
        this.driver = driver;
    }

    @Override
    public void move() {
        System.out.println("Автобус їде");
    }

    @Override
    public void stop() {
        System.out.println("Автобус зупинився");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void size() {
        System.out.println("10x4");
    }
}
