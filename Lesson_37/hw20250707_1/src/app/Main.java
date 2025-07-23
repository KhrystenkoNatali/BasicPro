package app;

import app.model.Product;
import app.model.comparators.ComparatorByName;
import app.model.comparators.ComparatorByRating;
import app.model.comparators.ComparatorByStock;
import app.model.comparators.ComparatorProductByPrice;
import app.service.ProductsUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        double a=10.1; // примитивное значение double
        Double a1 = 10.1; // объект класса Double
        String h= new String("hello");
        */

        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 999.99, 8, 10));
        products.add(new Product("Laptop", 1599.99, 8, 3));
        products.add(new Product("Mouse", 19.99, 7, 100));
        products.add(new Product("Keyboard", 49.99, 9, 45));

        while (true) {
            System.out.println("Выберите способ сортировки: ");
            System.out.println("1. по имени");
            System.out.println("2. по цене(по возрастанию)");
            System.out.println("3. по цене(по убыванию)");
            System.out.println("4. по рейтингу");
            System.out.println("5. по количеству на складе");
            System.out.println("Введите 0 для завершения");

            int selectedItem = scanner.nextInt();
            if (selectedItem == 0 ){
                break;
            }
            Comparator<Product> comparator = null;
            String sortType = null;
            switch (selectedItem) {
                case 1:
                    comparator = new ComparatorByName();
                    sortType = "по имени";
                    break;
                case 2:
                    comparator = new ComparatorProductByPrice();
                    sortType = "по цене, по возростанию ";
                    break;
                case 3:
                    comparator = new ComparatorProductByPrice().reversed();
                    sortType = "по цене, по убыванию ";
                    break;
                case 4:
                    comparator = new ComparatorByRating().reversed();
                    sortType = "по рейтингу; ";
                    break;
                case 5:
                    comparator = new ComparatorByStock();
                    sortType = "по количеству на складе";
                    break;
            }
            if (comparator!=null){
                ProductsUtil.sort(products,comparator);
                System.out.println("Список товаров (" + sortType +")");
                ProductsUtil.print(products);
                System.out.println();
            } else {
                System.out.println("Ошибочный ввод");
            }
        }


    }
}
