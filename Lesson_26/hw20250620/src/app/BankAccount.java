package app;

public class BankAccount {
    String iban;    // номер счета
    double balance; // баланс счета
    Person owner;   // владелец счета
    MyDate open;    //дата открытия

    public BankAccount(String ibanStr, double b, Person ownerPerson, MyDate opDate) {
        iban = ibanStr;
        balance = b;
        owner = ownerPerson;
        open = opDate;
    }
}
