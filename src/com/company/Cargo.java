package com.company;

public class Cargo {

    private int weight;
    private int width;
    private int height;

    public Cargo() {
    }

    public Cargo(int weight, int width, int height) {
        this.weight = weight;
        this.width = width;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
