package app;

public class Task1 {

    public static void main(String[] args) {
        String name1 = "Олег";
        String name2 = "Николаевич";
        String name3 = "Олегов";

        //char firstCh =  name1.charAt(0);


        // -----------------------------


        String nameString = name1 + " " + name2 + " " + name3
                + " (" + name1.charAt(0) + "." + name2.charAt(0) + ". " + name3 + ")";

        // ---------------------------

        System.out.println(nameString);


    }
}


/*
 Исходные данные программы:
- имя
- отчество
- фамилия

Создайте переменные для этих данных. После чего сформируйте строке вида
 */