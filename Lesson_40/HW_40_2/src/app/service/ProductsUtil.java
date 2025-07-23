package app.service;

import app.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ProductsUtil {
    private ProductsUtil() {}

    public static void print(List<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static void sort(List<Product> list, Comparator<Product> comparator) {
        Collections.sort(list, comparator);
    }
}
