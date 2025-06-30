package app;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Book[] books = {
                new Book("Гарри Поттер и Философский камень", "Джоан Роулинг", "Фантастика", 1997),
                new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", "Фантастика", 1998),
                new Book("Властелин Колец", "Дж. Р. Р. Толкин", "Фэнтези", 1954),
                new Book("1984", "Джордж Оруэлл", "Антиутопия", 1949)

        };
        BookArray bookArray = new BookArray(books);

        System.out.println("Список всех книг:");
        System.out.println(bookArray);

        System.out.println("\nПоиск по автору:\n" + getBooksByAuthor(scanner, bookArray));
        System.out.println("\nПроверка наличия книги:");
        hasBookByTitle(scanner, bookArray);

// SOLID
    }

    public static void hasBookByTitle(Scanner scanner, BookArray bookArray){
        System.out.println("Есть ли книга которая называется?");
        String inputTitle = scanner.nextLine().trim();
        boolean result = bookArray.isBookByTitleExists(inputTitle);
        if (result) {
            System.out.println("Такая книга есть!");
        } else {
            System.out.println("Такой книги нет.");
        }
    }

    public static String getBooksByAuthor(Scanner scanner, BookArray bookArray) {
        System.out.println("Введите автора книги:");
        String inputAuthor = scanner.nextLine();
        String result = bookArray.getBooksByAuthor(inputAuthor);
        if (result.isEmpty()) {
            return "Нет книг с таким автором!";
        } else {
            return result;
        }
    }


}
