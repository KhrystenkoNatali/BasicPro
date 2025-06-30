/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
title (название), author (автор), genre (жанр),
 yearOfPublished (год издания).
 Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры

Задача 2
Реализуйте класс BookArray, который управляет массивом книг.
Класс должен похволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */
package app;

//Группа 68m

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(  "1984", "George Orwell", "Dystopian", 1949);

        System.out.println(book1);

        book1.setTitle("Nineteen Eighty-Four");

        System.out.println(book1);
    }
}
