package com.accountmanagement;

public class Accounts {

    private double balance;

    public Accounts(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
