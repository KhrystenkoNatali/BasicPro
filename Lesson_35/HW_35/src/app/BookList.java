package app;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int countOccurrences(Book target) {
        int count = 0;
        for (Book book : books) {
            if (book.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
