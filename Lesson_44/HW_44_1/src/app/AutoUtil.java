package app;

import java.util.*;

public class AutoUtil {
    public static void sortById(List<Auto> list) {
        list.sort((a1, a2) -> Integer.compare(a1.getId(), a2.getId()));
    }

    public static void sortByPrice(List<Auto> list) {
        list.sort((a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice()));
    }

    public static void sortByYear(List<Auto> list) {
        list.sort((a1, a2) -> Integer.compare(a1.getYear(), a2.getYear()));
    }

    public static void sortByBrand(List<Auto> list) {
        list.sort((a1, a2) -> a1.getBrand().compareTo(a2.getBrand()));
    }
}
