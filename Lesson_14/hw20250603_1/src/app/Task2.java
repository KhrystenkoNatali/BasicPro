package app;

public class Task2 {

    public static void main(String[] args) {

        double price = 200.0;
        double taxPercent = 19;

        double tax =price / 100 * taxPercent;
        double priseWithTfx = price + tax;

        System.out.println("Цена товара: " + price);
        System.out.println("Налог: " + taxPercent + "%");
        System.out.println("Суммф нфлога: " + tax);
        System.out.println("Цена с налогом: " + priseWithTfx);
    }
}
