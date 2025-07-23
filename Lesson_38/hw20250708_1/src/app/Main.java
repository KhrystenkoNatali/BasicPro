package app;

import app.model.Product;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add(new Product("phone0",699.0, 8,101));
        list.add(new Product("phone1",630.0, 9,20));
        list.add(new Product("phone2",290.0, 7,29));
        list.add(new Product("phone3",301.0, 5,44));
        list.add(new Product("phone4",330.0, 6,2));
        list.add(new Product("phone5",586.0, 8,78));
        list.add(new Product("phone6",300.0, 9,89));
        System.out.println(list);
        System.out.println("Первый элемент:" + list.get(0));
        System.out.println("Последний элемент:" + list.get(list.size()-1));
    }
}
