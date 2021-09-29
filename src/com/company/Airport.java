package com.company;

public class Airport implements IAirport {

    private String name;
    private String country;
    private int runways;
    private Plane[] planes;

    public Airport() {
    }

    public Airport(String name, String country, int runways, Plane[] planes) {
        this.name = name;
        this.country = country;
        this.runways = runways;
        this.planes = planes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public Plane[] getPlanes() {
        return planes;
    }

    public void setPlanes(Plane[] planes) {
        this.planes = planes;
    }

    @Override
    public boolean equals(Plane plane) {
        for (Plane p : this.planes) {
            if(p==plane)return true;
        }
        return false;
    }
}
