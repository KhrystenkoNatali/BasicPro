/*
Помните проект про сортировку товаров разными способами?
Перепишите его используя анонимные классы
 */
package app;

import app.model.Product;
import app.service.ProductsUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 999.99, 8, 10));
        products.add(new Product("Laptop", 1599.99, 8, 3));
        products.add(new Product("Mouse", 19.99, 7, 100));
        products.add(new Product("Keyboard", 49.99, 9, 45));

        while (true) {
            System.out.println("Выберите способ сортировки:");
            System.out.println("1. по имени");
            System.out.println("2. по цене (по возрастанию)");
            System.out.println("3. по цене (по убыванию)");
            System.out.println("4. по рейтингу");
            System.out.println("5. по количеству на складе");
            System.out.println("0. для завершения");

            int selectedItem = scanner.nextInt();
            if (selectedItem == 0) break;

            Comparator<Product> comparator = null;
            String sortType = null;

            switch (selectedItem) {
                case 1:
                    comparator = new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    };
                    sortType = "по имени";
                    break;
                case 2:
                    comparator = new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Double.compare(o1.getPrice(), o2.getPrice());
                        }
                    };
                    sortType = "по цене (возрастание)";
                    break;
                case 3:
                    comparator = new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Double.compare(o2.getPrice(), o1.getPrice());
                        }
                    };
                    sortType = "по цене (убывание)";
                    break;
                case 4:
                    comparator = new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Integer.compare(o2.getRating(), o1.getRating());
                        }
                    };
                    sortType = "по рейтингу";
                    break;
                case 5:
                    comparator = new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Integer.compare(o1.getStock(), o2.getStock());
                        }
                    };
                    sortType = "по количеству на складе";
                    break;
                default:
                    System.out.println("Неверный ввод");
                    continue;
            }

            ProductsUtil.sort(products, comparator);
            System.out.println("Список товаров (" + sortType + "):");
            ProductsUtil.print(products);
        }
    }
}
