package com.company;

public class Dispatcher extends Person implements IPerson{

    private int workHours;
    private String[] workDays;

    public Dispatcher() {
    }

    public Dispatcher(int workHours, String[] workDays) {
        this.workHours = workHours;
        this.workDays = workDays;
    }

    @Override
    public void work() {
        System.out.println("Диспетчер вийшов на роботу");
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String[] getWorkDays() {
        return workDays;
    }

    public void setWorkDays(String[] workDays) {
        this.workDays = workDays;
    }

    @Override
    public void salary() {
        System.out.println("19000$");
    }
}
