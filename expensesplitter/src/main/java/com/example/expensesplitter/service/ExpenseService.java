package com.example.expensesplitter.service;

import com.example.expensesplitter.model.Participant;
import com.example.expensesplitter.model.Expense;
import org.springframework.stereotype.Service;

import java.util.*;

@Service // Spring annotation
public class ExpenseService {

    public Map<String, Double> calculateBalances(Expense expense) {
        List<Participant> participants = expense.getParticipants();

        // Get all the ammounts to pay from an Expense and sum them.
        double total = participants.stream()
                .mapToDouble(Participant::getAmountPaid)
                .sum();

        double equalShare = total / participants.size();

        // I chose a map so I can track the expense to a participant
        Map<String, Double> balances = new HashMap<>();

        // Add to balances the participant and their owed ammount
        for (Participant p : participants) {
            balances.put(p.getName(), p.getAmountPaid() - equalShare);
        }

        return balances;
    }
}
