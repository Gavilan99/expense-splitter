package com.example.expensesplitter.model;

public class Participant {
    private String name;
    private double ammountPaid;

    public Participant(String name, double ammountPaid){
        this.name = name;
        this.ammountPaid = ammountPaid;
    }

    public String getName() {
        return name;
    }

    public double getAmmountPaid(){
        return ammountPaid;
    }

    public void setAmmountPaid() {
        this.ammountPaid = ammountPaid;
    }
}
