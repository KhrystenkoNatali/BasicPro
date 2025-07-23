package app;

import app.model.Author;
import app.model.Book;
import app.service.BookUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Author> authors1 = new ArrayList<>();
        authors1.add(new Author("Илья", "Ильф", 1897));
        authors1.add(new Author("Евгений", "Петров", 1902));

        List<Author> authors2 = new ArrayList<>();
        authors2.add(new Author("Михаил", "Булгаков", 1891));

        List<Book> books = new ArrayList<>();
        books.add(new Book("12 стульев", authors1));
        books.add(new Book("Мастер и Маргарита", authors2));
        books.add(new Book("Золотой теленок", authors1));
        books.add(new Book("Собачье сердце", authors2));
        books.add(new Book("Одноэтажная америка", authors1));

        BookUtil.print(books);
        Author author = new Author("Илья", "Ильф", 1897);
        List<Book> booksByAuthor = BookUtil.findBooksByAuthor(books,author);
        System.out.println("=============================");
        BookUtil.print(booksByAuthor);
    }
}
