package app;

public class Task10 {
    public static void main(String[] args) {
        String str = "hello java";

        char[] charArray = str.toCharArray();// массив из char входящих в строку
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + "   ");
        }
    }
}
