/*
1. Создайте класс Book (название, автор). Создайте ArrayList<Book>.
Добавьте туда несколько объектов.
Напишите метод ArrayList<Book> getBook (ArrayList<Book> list, String author)
который возвращает список книг, заданного автора.
Распечатайте его из мейна.
1.2 adv.
Предусмотрите в задаче 1. возможность поиска книг по списку авторов для
конкретной книги НАПРИМЕР
Илья Ильф, Евгений Петров
Борис Стругацкий, Аркадий Стругацкий
 */
package app;

// Группа 68m

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Добавление книг
        books.add(new Book("Двенадцать стульев", "Илья Ильф", "Евгений Петров"));
        books.add(new Book("Одноэтажная Америка", "Илья Ильф", "Евгений Петров"));
        books.add(new Book("Пикник на обочине", "Аркадий Стругацкий", "Борис Стругацкий"));
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский"));

        // Поиск по одному автору
        ArrayList<Book> ilfBooks = BookUtils.getBooksByAuthor(books, "Илья Ильф");
        System.out.println("Книги Ильи Ильфа:");
        for (Book b : ilfBooks) {
            System.out.println(b);
        }

        // Поиск по списку авторов (advanced)
        List<String> strugatskie = List.of("Аркадий Стругацкий", "Борис Стругацкий");
        ArrayList<Book> strugatskyBooks = BookUtils.getBooksByAuthors(books, strugatskie);
        System.out.println("\nКниги Стругацких:");
        for (Book b : strugatskyBooks) {
            System.out.println(b);
        }
    }
}
