package app;

// Группа 68m

public class Main1 {

    public static void main(String[] args) {
        /*
        Создайте новый модуль. В модуле создайте package c названием app.
        Создайте новый класс. Создайте метод main. Исходные данные:
        Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.

          Напишите программу, которая сохраняет эти данные в переменных, вычисляет и выводит в консоль,
          сколько билетов вы можете купить. Сколько денег у вас останется,
          после покупки максимально возможного количества билетов.
         */
        int priseForOneTicket = 4;
        int totaiMoney = 19;

        int ticket = totaiMoney / priseForOneTicket;
        int change = totaiMoney % priseForOneTicket;

        System.out.println("Можно купить билетов: " + ticket);
        System.out.println("Останеться денег: " + change + " y.e.");


    }
}
