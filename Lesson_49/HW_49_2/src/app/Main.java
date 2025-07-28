/*
Доработайте первую задачу так, чтобы в случае некорректного ввода,
пользователь получал бы информацию о всех невыполненных требованиях,
т.е. например, система должна сообщать, что “строка короче 5 символов,
@ не должна быть последней” а не только какое то одно из условий

 */
package app;

import exception.NotCorrectEmailFormatException;
import util.EmailChecker;

public class Main {
    public static void main(String[] args) {
        try {
            EmailChecker.checkEmail();
        } catch (NotCorrectEmailFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
