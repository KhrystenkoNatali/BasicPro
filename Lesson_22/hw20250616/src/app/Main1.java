package app;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("первый поход:");
        goShop();
        System.out.println("сходили");
        System.out.println("второй поход:");
        goShop();
        System.out.println("сходили");

    }

    public static void goShop(){
        System.out.println("1. одеваюсь");
        System.out.println("2. выхожу на улицу");
        System.out.println("3. иду в магазин");
        System.out.println("4. делаю покупки");
        System.out.println("5. возвращаюсь");
    }
}
