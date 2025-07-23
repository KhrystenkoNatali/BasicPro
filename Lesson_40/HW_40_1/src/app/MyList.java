package app;

import app.model.Product;
import java.util.Iterator;

public interface MyList  extends Iterable<Product> {
    int size();
    void add(Product person);
    Product get(int index);
}
