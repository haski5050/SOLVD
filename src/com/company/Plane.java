package com.company;

public class Plane extends Transport implements ITransport{

    private int maxHeight;
    private int fuelTank;

    public Plane() {
    }

    public Plane(int maxHeight, int fuelTank) {
        this.maxHeight = maxHeight;
        this.fuelTank = fuelTank;
    }

    @Override
    public void move() {
        System.out.println("Літак взлетів");
    }

    @Override
    public void stop() {
        System.out.println("Літак приземлився");
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void size() {
        System.out.println("100x50");
    }
}
