package app;

public class Main {

    public static void main(String[] args) {
        boolean isEvening = false;
        boolean isMorning = true;

        int a = 15;
        double b = 2.6;

        boolean bool1 = a > b;
        System.out.println("a > b :" + bool1);

        boolean isEven =  a % 2 == 0;   // четное ли число a
        System.out.println("Число " + a + " четное: " + isEven);


    }
}
