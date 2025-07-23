package app.model;

public class Product {
    private String name;
    private double price;
    private int rating;
    private int stock;

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
