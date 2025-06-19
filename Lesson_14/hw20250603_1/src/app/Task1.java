package app;

public class Task1 {

    public static void main(String[] args) {
        int ticketPrice = 4;
        int money = 19;

        int ticket = money / ticketPrice;
        int rest = money % ticketPrice;

        System.out.println("Доступно билетов: " + ticket);
        System.out.println("Остаток денег: " + rest);
    }
}
