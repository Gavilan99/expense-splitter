package com.example.expensesplitter.model;

public class Participant {
    private String name;
    private double amountPaid;

    public Participant(String name, double amountPaid){
        this.name = name;
        this.amountPaid = amountPaid;
    }

    public String getName() {
        return name;
    }

    public double getAmountPaid(){
        return amountPaid;
    }

    public void setAmmountPaid() {
        this.amountPaid = amountPaid;
    }
}
