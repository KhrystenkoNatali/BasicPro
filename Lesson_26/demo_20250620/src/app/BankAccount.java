package app;

public class BankAccount {
    String iban;    // номер счета
    double balance; // баланс счета
    Person owner;   // владелец счета
    MyDate open;    //дата открытия

    public BankAccount(String iban, double balance, Person owner, MyDate open) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
        this.open = open;
    }

    // "DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
    public void printAccount(){
        System.out.println(iban + " " + owner +
                " Счет открыт: " + open.toString() + " Баланс: " + balance  );
    }

    public String toString(){
        return  iban + " " + owner +
                " Счет открыт: " + open + " Баланс: " + balance;
    }
}
