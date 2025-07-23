package app.model;

import app.model.comparators.ComparatorByName;
import app.model.comparators.ComparatorByRating;
import app.model.comparators.ComparatorByStock;
import app.model.comparators.ComparatorProductByPrice;

import java.util.Comparator;

public class Product {
    private String name;
    private double price;
    private int rating;
    private int stock;

    public static final Comparator<Product> BY_NAME = new ComparatorByName();
    public static final Comparator<Product> BY_PRICE = new ComparatorProductByPrice();
    public static final Comparator<Product> BY_PRICE_DESC = new ComparatorProductByPrice().reversed();
    public static final Comparator<Product> BY_RATING = new ComparatorByRating().reversed();
    public static final Comparator<Product> BY_STOCK = new ComparatorByStock().reversed();


    public Product(String name, double price, int rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return  name + ", price=" + price + ", rating=" + rating + ", stock=" + stock;
    }
}
