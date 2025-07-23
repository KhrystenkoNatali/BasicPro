package app;

import java.util.List;

public class Book {
    private String title;
    private List<String> authors;

    public Book(String title, String... authors) {
        this.title = title;
        this.authors = List.of(authors); // создаёт список авторов из аргументов
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" — " + String.join(", ", authors);
    }
}
