package app;

public class MainArrayProduct {
    public static void main(String[] args) {
        MyListProduct list = new MyArrayListProduct();

        list.add(new Product("Milk", 1.50));
        list.add(new Product("Bread", 0.90));
        list.add(new Product("Apple", 0.50));
        list.add(new Product("Eggs", 2.30));

        System.out.println(list);
        System.out.println("Размер списка: " + list.size());
        System.out.println("Элемент с индексом 0: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size() - 1));
    }
}
