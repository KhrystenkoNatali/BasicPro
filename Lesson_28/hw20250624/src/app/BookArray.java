package app;

public class BookArray {
    private Book[] books;



    public BookArray(Book[] books) {
        this.books = books;
    }


    public String toString() {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            result += "Книга " +(i+1) +" "+ books[i]
                    + "\n=========================================================================\n";
        }
        return result;
    }
    public String getBooksByAuthor(String inputAuthor) {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(inputAuthor)) {
                result += books[i] +  "\n===================================================================\n" ;
            }
        }
        return result;
    }
    public boolean isBookByTitleExists(String inputTitle){
        boolean result = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(inputTitle)) {
                return true;
            }
        }
        return false;
    }



}
