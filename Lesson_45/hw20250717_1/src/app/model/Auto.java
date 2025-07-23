package app.model;

public class Auto {
    private int id;
    private String brand;
    private int year;
    private int price;


    public Auto(int id, String brand, int year, int price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + brand + "(" + year + ") , price:" + price;
    }
}
