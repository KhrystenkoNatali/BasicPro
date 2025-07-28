/*
a) Напишите программу, которая позволяет пользователю вводить с клавиатуры строки
и записывает эти строки в файл. Для выхода из программы,
пользователь должен ввести строку “exit”. В итоге должен быть файл со всеми введенными строками.
b) Ваша программа должна прочитать сформированный файл и вывести его содержимое на экран.
 */
package app;
//Группа 68m
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            while (true) {
                System.out.print("Введите строку (exit - для выхода): ");
                String line = scanner.nextLine();

                if (line.equals("exit")) {
                    break;
                }

                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }
}
