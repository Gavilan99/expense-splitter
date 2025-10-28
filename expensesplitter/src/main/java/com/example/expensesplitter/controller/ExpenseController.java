package com.example.expensesplitter.controller;

import com.example.expensesplitter.model.Expense;
import com.example.expensesplitter.service.ExpenseService;
import org.springframework.web.bind.annotation.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    public class ExpenseController {
        private final ExpenseService expenseService;

        public ExpenseController(ExpenseService expenseService) {
            this.expenseService = expenseService;
        }

        @PostMapping
        public Map<String, Double> splitExpense(@RequestBody Expense expense) {
            return expenseService.calculateBalances(expense);
        }
    }
}
