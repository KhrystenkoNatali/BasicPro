package task3.app.model;

import task2.app.model.Person;

public class Account {
    private String iban;
    private Person owner;
    private double balance;

    public Account(String iban, Person owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return String.format("%s (%20s): %10.2f", iban,owner,balance);
    }
}
