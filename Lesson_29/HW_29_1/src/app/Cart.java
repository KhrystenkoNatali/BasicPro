package app;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        double total = 0;
        System.out.println("Ваш заказ:");
        for (Product p : items) {
            System.out.println(p.getName() + " - " + p.getPrice() + "€");
            total += p.getPrice();
        }

        System.out.println("Итого: " + total + "€");
    }
}
