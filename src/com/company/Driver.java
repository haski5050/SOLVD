package com.company;

public class Driver extends Person implements IPerson{

    private int experience;
    private String[] licenseCategory;

    public Driver() {
    }

    public Driver(int experience, String[] licenseCategory) {
        this.experience = experience;
        this.licenseCategory = licenseCategory;
    }

    @Override
    public void work() {
        System.out.println("Водій вийшов до роботи");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String[] getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String[] licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    @Override
    public void salary() {
        System.out.println("5000$");
    }
}
