package app;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("первый поход:");
        goShop("хлеб", 2, "Lidl");
        System.out.println("сходили");
        System.out.println("второй поход:");
        goShop("молоко", 1,"Penny");
        System.out.println("сходили");

        goShop("чай", 1,"Penny");
        goShop("пицца", 2,"Lidl");

    }

    public static void goShop(String product, int quantity , String shopName){
        System.out.println("1. одеваюсь");
        System.out.println("2. выхожу на улицу");
        System.out.println("3. иду в магазин: " + shopName);
        System.out.println("4. покупаю " + product + " (" + quantity + "шт.)");
        System.out.println("5. возвращаюсь");
    }
}
