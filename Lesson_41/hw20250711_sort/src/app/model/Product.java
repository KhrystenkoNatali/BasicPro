package app.model;

import app.model.comparators.ComparatorByRating;
import app.model.comparators.ComparatorByStock;


import java.util.Comparator;

public class Product {
    private String name;
    private double price;
    private int rating;
    private int stock;

    public static final Comparator<Product> BY_NAME = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static final Comparator<Product> BY_PRICE = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.price, o2.price);
        }
    };
    public static final Comparator<Product> BY_PRICE_DESC = BY_PRICE.reversed();
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
