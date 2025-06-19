package app;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Olga","Oleg","Svetlana","Oleg"};
        int[] yearsOfBirthday = {2004,1982,2008,2010};
        int ageLimit = 15;
        int year = 2025;

        int indexMin = 0; // номер минимального года в массиве yearsOfBirthday


        for (int i = 0; i < names.length ; i++) {
            int age = year - yearsOfBirthday[i];
            if (age > ageLimit) {
                System.out.println(names[i] + "(" + age + ")");
            }

            if (yearsOfBirthday[indexMin] > yearsOfBirthday[i]){
                indexMin = i;
            }

        }
        System.out.println("---------------------------------------");
        System.out.println("Самый старший: " + names[indexMin] + "(" + yearsOfBirthday[indexMin] + ")");


    }
}
