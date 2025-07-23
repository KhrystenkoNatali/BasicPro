package app.model;

public class BankAccount {
    private Person owner;
    private String iban;
    private double balance;

    public BankAccount(Person owner, String iban, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner=" + owner +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
