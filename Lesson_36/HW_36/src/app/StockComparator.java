package app;

import java.util.Comparator;

public class StockComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Integer.compare(p2.getStock(), p1.getStock());
    }
}
