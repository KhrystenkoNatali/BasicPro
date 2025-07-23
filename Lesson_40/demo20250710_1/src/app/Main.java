package app;

public class Main {
    public static void main(String[] args) {

        // анонимный класс
        // r - объект какого то класса (например, $Runnable001),
        // который реализует интерфейс Runnable

        MyRunnable r = new MyRunnable() {
            private  int currentNodeIndex = 0;
            @Override
            public void run() {
                System.out.println("hello from unanimous class");
            }
        };
        r.run();

        MyRunnable r2 = new Runner1();
        r2.run();

    }
}
