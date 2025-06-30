package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Хлеб",1.70));
        productList.add(new Product("Молоко",1.85));
        productList.add(new Product("Масло",2.49));
        productList.add(new Product("Рис",2.30));
        List<Product> cart = createCart(productList);
        System.out.println("------ Корзина: --------------");
        print(cart);
        System.out.println("-------------------------------");
        System.out.println("Количество позиций: " + calcOrderSize(cart));
        System.out.println("Сумма заказа : " + calcSumOfOrder(cart));

    }

    private static int calcOrderSize(List<Product> cart) {
        return cart.size();
    }

    public static void print(List<Product> list){
        int i = 1;
        for (Product product: list ){
            System.out.println(i + ". " + product);
            i++;
        }
    }

    public static List<Product> createCart(List<Product> productList){
        List<Product> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------");
        print(productList);
        System.out.println("-----------------------------");
        while (true) {
            System.out.println("Выберите товар или введите 0 для завершения:");
            int item = scanner.nextInt();
            if (item == 0){
                break;
            } else {
                if (item>=1 && item <= productList.size()) {
                    Product product = productList.get(item - 1);
                    cart.add(product);
                    System.out.println("добавили " + product);
                } else {
                    System.out.println("товар не найден");
                }
            }
        }
        return cart;
    }

    public static double calcSumOfOrder(List<Product> list){
        double sum = 0;
        for (Product product: list){
            sum+=product.getPrice();
        }
        return sum;
    }


}
