package com.example.expensesplitter.model;

import java.util.List;

public class Expense {
    private List<Participant> participants;

    public Expense(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Participant> getParticipants() {
        return participants;
    }
}
