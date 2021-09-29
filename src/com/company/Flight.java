package com.company;

import java.util.Date;
import java.util.Objects;

public class Flight implements IFlight {

    private Client[] clients;
    private Plane plane;
    private String country;
    private Date date;

    public Flight() {
    }

    public Flight(Client[] clients, Plane plane, String country, Date date) {
        this.clients = clients;
        this.plane = plane;
        this.country = country;
        this.date = date;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRun(){
        return Objects.equals(this.date, new Date());
    }

    @Override
    public void flyTo() {
        System.out.println(this.country);
    }
}
