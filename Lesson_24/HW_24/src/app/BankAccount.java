/*
Создайте классы MyData и Person по примеру того, как это было на занятии.
Создайте класс BankAccount (банковский счет) с соблюдением правил

String iban - номер счета
двойной баланс - баланс счета
Лицо-собственник - владелец счета
Открытая дата открытия MyDate. Вам необходимо создать конструктор,
а затем создать в программе несколько объектов банковских счетов.
Необходимо написать метод, который формирует запрос с информацией о счете,
например, такого вида:
"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
~~

 */
package app;

public class BankAccount {
    String iban;
    double balance;
    Person owner;
    MyDate openDate;

    public BankAccount(String iban, double balance, Person owner, MyDate openDate) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
        this.openDate = openDate;
    }

    public String getAccountInfo() {
        return iban + "  " + owner + " Счет открыт: " + openDate + "  Баланс " + balance;
    }

    public static void main(String[] args) {
        MyDate birthDate1 = new MyDate(19, 10, 1987);
        Person person1 = new Person("Н.", "Петров", birthDate1);
        MyDate openDate1 = new MyDate(1, 2, 2025);

        BankAccount account1 = new BankAccount("DE123412341234", 10345.10, person1, openDate1);

        System.out.println(account1.getAccountInfo());
    }
}