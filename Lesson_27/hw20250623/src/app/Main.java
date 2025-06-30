package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        Pet[] petArray = createPetArray(size);
        printArr(petArray);
        printInfoByType(petArray,"собака");
    }

    public static Pet inputPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип:");
        String type = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите цвет:");
        String color = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        return new Pet(type, name, color, age);
    }


    public static Pet[] createPetArray(int size){
        Pet[] arr = new Pet[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Вводим питомца №"+(i+1));
            arr[i] = inputPet();
            System.out.println("Pet: " + arr[i]);
            System.out.println("----------------------");
        }

        return arr;

    }

    public static void printArr(Pet[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printInfoByType (Pet[] arr, String type){
        int count = 0;
        int sumAges = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].type.equals(type)){
                count++;
                sumAges+=arr[i].age;
            }
        }

        if (count==0){
            System.out.println("Животных с типом " + type + " нет в базе");
        } else {
            System.out.println("Животных с типом " + type + ": " + count );
            System.out.println("Средний возраст: " + ((double)sumAges/count));
        }


    }
}
