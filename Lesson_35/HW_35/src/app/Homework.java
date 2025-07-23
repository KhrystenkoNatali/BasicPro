/*
Создайте класс книга Book (String title, String author). Создайте список из книг.
Реализуйте метод, который считает сколько раз заданная книга встречается в списке

 */
package app;
//Группа 68m
public class Homework {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Brave New World", "Aldous Huxley");

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        Book target = new Book("1984", "George Orwell");
        int count = bookList.countOccurrences(target);

        System.out.println("Книга \"" + target.getTitle() + "\" автора " +
                target.getAuthor() + " встречается " + count + " раз.");
    }
}
