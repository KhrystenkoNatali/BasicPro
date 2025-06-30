package app;

public class Main {
    public static void main(String[] args) {
        PersonArray personArray = new PersonArray();
        personArray.add( new Person("Jack1", 10) );
        personArray.add( new Person("Jack2", 11) );
        personArray.add( new Person("Jack3", 12) );
        System.out.println("Добавили 3 элемента");
        System.out.println(personArray.toString());
        personArray.add( new Person("Jack4", 13) );
        personArray.add( new Person("Jack5", 14) );
        System.out.println("Добавили 5 элемента");
        System.out.println(personArray.toString());

        personArray.add( new Person("Jack6", 14) );
        personArray.add( new Person("Jack7", 15) );
        personArray.add( new Person("Jack8", 16) );
        personArray.add( new Person("Jack9", 17) );

        System.out.println("Добавили 9 элементов");
        System.out.println(personArray.toString());


         /*




        System.out.println(personArray);


        System.out.println("--------------------");
        System.out.println(personArray.get(0));
        for (int i = 0 ; i< personArray.size(); i++){
            System.out.println(i + ". " + personArray.get(i));
        }

*/





    }
}
