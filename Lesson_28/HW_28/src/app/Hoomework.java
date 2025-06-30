/*
По образу и подобию кода написанного на занятие,
сделайте из вашего класса BookArray (в проектe про книги)
динамический массив. Т.е. ваша программа должна позволять
пользователю вводить и обрабатывать любое количество книг
При выполнении данного задания не используйте стандартный
Java класс ArrayList
 */
package app;

// Группа 68m

import java.util.Scanner;

public class Hoomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookArray bookArray = new BookArray();

        System.out.print("Сколько книг вы хотите ввести? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nВведите данные для книги #" + (i + 1));

            System.out.print("Название: ");
            String title = scanner.nextLine();

            System.out.print("Автор: ");
            String author = scanner.nextLine();

            System.out.print("Жанр: ");
            String genre = scanner.nextLine();

            System.out.print("Год выпуска: ");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, author, genre, year);
            bookArray.add(book);
        }

        System.out.println("\nСписок всех книг:");
        System.out.println(bookArray);

        System.out.println("\nПоиск по автору:\n" + getBooksByAuthor(scanner, bookArray));
        System.out.println("\nПроверка наличия книги:");
        hasBookByTitle(scanner, bookArray);
    }

    public static void hasBookByTitle(Scanner scanner, BookArray bookArray){
        System.out.print("Введите название книги для проверки: ");
        String inputTitle = scanner.nextLine().trim();
        boolean result = bookArray.isBookByTitleExists(inputTitle);
        if (result) {
            System.out.println("Такая книга есть!");
        } else {
            System.out.println("Такой книги нет.");
        }
    }

    public static String getBooksByAuthor(Scanner scanner, BookArray bookArray) {
        System.out.print("Введите имя автора: ");
        String inputAuthor = scanner.nextLine();
        String result = bookArray.getBooksByAuthor(inputAuthor);
        if (result.isEmpty()) {
            return "Нет книг с таким автором!";
        } else {
            return result;
        }
    }
}
