package app;

import java.util.ArrayList;
import java.util.List;

public class BookUtils {

    public static ArrayList<Book> getBooksByAuthor(ArrayList<Book> list, String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static ArrayList<Book> getBooksByAuthors(ArrayList<Book> list, List<String> authors) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : list) {
            for (String author : book.getAuthors()) {
                if (authors.contains(author)) {
                    result.add(book);
                    break;
                }
            }
        }
        return result;
    }

    public static int countOccurrences(List<Book> books, Book target) {

        return 0;
    }
}
