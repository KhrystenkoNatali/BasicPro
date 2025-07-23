package app.model.comparators;

import app.model.Product;

import java.util.Comparator;

public class ComparatorByStock  implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getStock(), o2.getStock());
    }
}
