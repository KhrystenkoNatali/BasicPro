package app;

import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.getRating(), p1.getRating());
    }
}
