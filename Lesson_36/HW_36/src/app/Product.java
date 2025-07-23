package app;

public class Product {
    private String name;
    private double price;
    private double rating;
    private int stock;

    public Product(String name, double price, double rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return name + " | Цена: " + price + " | Рейтинг: " + rating + " | В наличии: " + stock;
    }
}
