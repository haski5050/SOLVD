package com.company;

public class Client extends Person{

    private String nationality;
    private Cargo cargo;

    public Client() {
    }

    public Client(String nationality, Cargo cargo) {
        this.nationality = nationality;
        this.cargo = cargo;
    }

    @Override
    public void work() {
        System.out.println("Клієнт не працює!");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
