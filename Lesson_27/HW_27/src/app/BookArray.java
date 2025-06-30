package app;

public class BookArray {
    private Book[] books;
    private int size;

    public BookArray(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Массив книг заполнен!");
        }
    }

    public void printAllBooks() {
        System.out.println("Все книги:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет книг этого автора.");
        }
    }

    public boolean hasBookWithTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}
