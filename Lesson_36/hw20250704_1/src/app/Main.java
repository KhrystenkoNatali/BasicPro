package app;

import app.model.Book;
import app.service.BookUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Гарри Поттер и философский камень", "Дж. К. Роулинг"));
        books.add(new Book("Гарри Поттер и тайная комната", "Дж. К. Роулинг"));
        books.add(new Book("Властелин колец: Братство Кольца", "Дж. Р. Р. Толкин"));
        books.add(new Book("Властелин колец: Две крепости", "Дж. Р. Р. Толкин"));
        books.add(new Book("Гарри Поттер и тайная комната", "Дж. К. Роулинг"));
        books.add(new Book("1984", "Джордж Оруэлл"));
        books.add(new Book("Гарри Поттер и тайная комната", "Дж. К. Роулинг"));

        BookUtil.print(books);

        Book book = new Book("Гарри Поттер и тайная комната", "Дж. К. Роулинг");
        int count = BookUtil.count(books, book);
        System.out.println("Книга: [" + book + "] встречается в списке : " + count + "р.");
        System.out.println("Книга: [" + book + "] встречается в списке : " + Collections.frequency(books,book) + "р.");



    }
}
