package app;

public class BookArray {
    private Book[] books;
    private int size;

    public BookArray() {
        books = new Book[5]; // начальная ёмкость
        size = 0;
    }

    public void add(Book book) {
        if (size == books.length) {
            expandArray();
        }
        books[size++] = book;
    }

    private void expandArray() {
        Book[] newBooks = new Book[books.length * 2];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks;
    }

    public boolean isBookByTitleExists(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public String getBooksByAuthor(String author) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                result.append(books[i].toString()).append("\n");
            }
        }
        return result.toString().trim();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(books[i].toString()).append("\n");
        }
        return result.toString().trim();
    }
}
