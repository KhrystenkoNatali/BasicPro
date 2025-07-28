/*
Создайте метод, который просит пользователя ввести email.
Email считается корректным, если:
в нем не менее 5 символов,
есть один символ  ‘@’, он не должен быть первым или последним
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать
NotCorrectEmailFormatException.
В main сделайте обработку Exception

 */
package app;
// Группа 68m
import exception.NotCorrectEmailFormatException;
import util.EmailChecker;

public class Main {
    public static void main(String[] args) {
        try {
            EmailChecker.checkEmail();
        } catch (NotCorrectEmailFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
