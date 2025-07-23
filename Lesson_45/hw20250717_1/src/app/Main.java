package app;

import app.model.Auto;
import app.service.AutoService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Auto> list = List.of(
                new Auto(1, "BMW", 2022, 50000),
                new Auto(4, "Opel", 2017, 18500),
                new Auto(3, "Nissan", 2015, 10900),
                new Auto(6, "Audi", 2024, 78000),
                new Auto(9, "BMW", 2018, 20000)
        );
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Как вы хотите сортировать: 1. id 2. бренд, 3. год выпуска, 4. цена");


            // int compare(Auto a1, Auto a2);
            Comparator<Auto> comparator = null;
            switch (scanner.nextInt()) {
                case 1:
                    comparator = (Auto a1, Auto a2) -> {
                        return Integer.compare(a1.getId(), a2.getId());
                    };
                    break;
                case 2:
                    comparator = (Auto a1, Auto a2) -> {
                        return a1.getBrand().compareTo(a2.getBrand());
                    };
                    break;
                case 3:
                    comparator = (a1, a2) ->  a1.getYear() - a2.getYear();
                    break;

                case 4:
                    comparator = (a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice());
                    break;
                default:
                    return;
            }
            List<Auto> sortedList = AutoService.sort(list, comparator);
            AutoService.print(sortedList);
        }
    }
}
