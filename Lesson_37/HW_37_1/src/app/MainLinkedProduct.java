/*
Осознать код, написанный на занятие.
На занятие завтра мы продолжим его дорабатывать.
По образу и подобию (можно смотреть в код написанный на занятие)
написать свою реализацию листов которая позволяет хранить Product (из задачи про магазин)
 */
package app;
//Группа 68m
public class MainLinkedProduct {
    public static void main(String[] args) {
        MyListProduct list = new MyLinkedListProduct();

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
