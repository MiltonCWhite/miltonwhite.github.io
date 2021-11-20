package com.CS102;

import java.util.ArrayList;
import java.util.Date;

public class Project3 {


    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account);
    }
}

 class Account {
        private String name;
        private int id = 0;
        private double balance = 0.0;
        private static double annualInterestRate = 0.0;
        private ArrayList<Transaction> Transactions;
        private java.util.Date dateCreated;

        public Account() {
            dateCreated = new java.util.Date();
            Transactions = new ArrayList<>();
        }

        public Account(String name, int id, double balance) {
            this();
            this.name = name;
            this.id = id;
            this.balance = balance;
        }

        public String getName() {
            return this.name;
        }

        public ArrayList<Transaction> getTransactions() {
            return this.Transactions;
        }

        public void setTransactions(ArrayList<Transaction> transactions) {
            this.Transactions = transactions;
        }

        public int getId() {
            return this.id;
        }

        public double getBalance() {
            return this.balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public String getDateCreated() {
            return this.dateCreated.toString();
        }

        public void setName(String name) {this.name = name;}

        public void setId(int id) {
            this.id = id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public double getMonthlyInterestRate() {
            return (annualInterestRate / 100) / 12;
        }

        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }

        public void withdraw(double amount) {
            Transactions.add(new Transaction('W', amount, balance, "withdraw"));
            balance -= amount;
        }

        public void deposit(double amount) {
            Transactions.add(new Transaction('D', amount, balance, "deposit"));
            balance += amount;
        }

        @Override
        public String toString() {
            String result = "Account name: " + name + "\n" + "Interest rate: " + annualInterestRate + "\n" + "Balance: " + balance + "\n";
            for(Transaction t : Transactions) {
                result += t + "\n";
            }
            return result;
        }
}

class Transaction{
    private java.util.Date dateCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.dateCreated = new java.util.Date();
    }

    @Override
    public String toString() {
        String result = dateCreated.toString();
        result+= " " + type;
        result+= " " + amount;
        result+= " " + balance;
        result+= " " + description;
        return result;
    }
}

