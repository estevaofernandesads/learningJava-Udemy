package org.example.Projects.Bank;

public class Bank {

    private int acountNumber;
    private String name;
    private double balance = 0;

    public Bank(String name, int acountNumber) {
        this.name = name;
        this.acountNumber = acountNumber;
    }

    public Bank(String name, int acountNumber, double initialDeposit) {
        this.name = name;
        this.acountNumber = acountNumber;
        deposit(initialDeposit);
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public String toString() {
        return String.format("Número da conta: %d, Nome: %s, Saldo na conta: $ %.2f%n", acountNumber, name,balance);
    }
}
