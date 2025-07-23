/*
Создайте класс книга Book (String title, List<Author> authors).
В отличие от первой задачи, авторов может быть много,
и  Author - объект из 3х полей (firstName, lastName, int year)
Создайте список из книг.
Реализуйте метод, который формирует список книг заданного автора
(т.е. если автор встречается в списке авторов книги,
книга должна попасть в итоговый список)

 */
package app;

import app.model.Author;
import app.model.Books;
import app.util.BooksUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Leo", "Tolstoy", 1828);
        Author a2 = new Author("Fyodor", "Dostoevsky", 1821);
        Author a3 = new Author("Anton", "Chekhov", 1860);

        Books b1 = new Books("War and Peace", Arrays.asList(a1));
        Books b2 = new Books("Crime and Punishment", Arrays.asList(a2));
        Books b3 = new Books("Russian Classics", Arrays.asList(a1, a2, a3));

        List<Books> allBooks = Arrays.asList(b1, b2, b3);

        List<Books> result = BooksUtils.findBooksByAuthor(allBooks, a2);

        System.out.println("Найденные книги автора " + a2 + ":");
        for (Books b : result) {
            System.out.println(b);
        }
    }
}
