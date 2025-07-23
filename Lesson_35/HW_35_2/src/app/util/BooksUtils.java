package app.util;

import app.model.Books;
import app.model.Author;

import java.util.ArrayList;
import java.util.List;

public class BooksUtils {
    public static List<Books> findBooksByAuthor(List<Books> books, Author author) {
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (book.getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }
}
