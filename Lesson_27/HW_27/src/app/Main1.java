package app;

public class Main1 {
    public static void main(String[] args) {
        BookArray library = new BookArray(5);

        library.addBook(new Book("1984", "George Orwell", "Dystopian", 1949));
        library.addBook(new Book("Animal Farm", "George Orwell", "Political Satire", 1945));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "Science Fiction", 1932));

        library.printAllBooks();

        library.printBooksByAuthor("George Orwell");

        String searchTitle = "1984";
        if (library.hasBookWithTitle(searchTitle)) {
            System.out.println("Книга '" + searchTitle + "' есть в библиотеке.");
        } else {
            System.out.println("Книги '" + searchTitle + "' нет в библиотеке.");
        }
    }
}
