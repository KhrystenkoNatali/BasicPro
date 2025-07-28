package app;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFilename = "persons.txt";
        String outputFilename = "persons_sorted.txt";

        List<Person> persons = new ArrayList<>();
        List<String> errorLog = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilename))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] parts = line.split(",");

                if (parts.length != 3) {
                    errorLog.add("Строка " + lineNumber + ": неверное количество полей");
                    continue;
                }

                String name = parts[0].trim();
                String ageStr = parts[1].trim();
                String email = parts[2].trim();

                int age;
                try {
                    age = Integer.parseInt(ageStr);
                } catch (NumberFormatException e) {
                    errorLog.add("Строка " + lineNumber + ": неверный возраст (" + ageStr + ")");
                    continue;
                }

                if (!isValidEmail(email)) {
                    errorLog.add("Строка " + lineNumber + ": неверный email (" + email + ")");
                    continue;
                }

                persons.add(new Person(name, age, email));
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        Set<Person> uniquePersons = new HashSet<>(persons);

        List<Person> sortedList = new ArrayList<>(uniquePersons);
        Collections.sort(sortedList, new PersonComparator());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilename))) {
            for (Person p : sortedList) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        if (errorLog.isEmpty()) {
            System.out.println("Ошибок не обнаружено.");
        } else {
            System.out.println("Протокол обработки ошибок:");
            for (String error : errorLog) {
                System.out.println(error);
            }
        }
    }

    private static boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        return atIndex > 0 && lastAtIndex == atIndex && atIndex < email.length() - 1;
    }

}
