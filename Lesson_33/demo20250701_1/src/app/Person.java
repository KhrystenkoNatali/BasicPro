package app;

public class Person {
    private String name;
    private int age;

    public void run(int day, int month, int year){
        class MyDate{
            int day;
            int month;
            int year;

            public MyDate(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }

            @Override
            public String toString() {
                return "MyDate{" +
                        "day=" + day +
                        ", month=" + month +
                        ", year=" + year +
                        '}';
            }
        }

        MyDate date=new MyDate(day, month, year);
        MyDate date2=new MyDate(25,2,2022);
        System.out.println(date);


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
