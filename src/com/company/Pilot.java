package com.company;

public class Pilot extends Person implements IPerson{

    private int flights;
    private String[] licenseCategory;

    public Pilot() {
    }

    public Pilot(int flights, String[] licenseCategory) {
        this.flights = flights;
        this.licenseCategory = licenseCategory;
    }

    @Override
    public void work() {
        System.out.println("Пілот вийшов до роботи");
    }

    public int getFlights() {
        return flights;
    }

    public void setFlights(int flights) {
        this.flights = flights;
    }

    public String[] getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String[] licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    @Override
    public void salary() {
        System.out.println("30000$");
    }
}
