package app.exceptions;

public class NotCorrectEmailFormatException extends RuntimeException{
    public NotCorrectEmailFormatException(String message) {
        super(message);
    }
}
