package app;

public class Person {
    private String fName; // обязательное поле
    private String lName; // обязательное поле
    private int age;
    private int weight;
    private int height;

    private Person(Builder builder){
        this.fName= builder.fName; // обязательное поле
        this.lName= builder.lName; // обязательное поле
        this.age= builder.age;
        this.weight= builder.weight;
        this.height= builder.height;
    }

    public static class Builder{
        private String fName;
        private String lName;
        private int age=0;
        private int weight=0;
        private int height=0;

        public Builder(String fName, String lName) {
            this.fName = fName;
            this.lName = lName;
        } // конструктор только на обязательные поля

        public Builder age(int age){
            this.age=age;
            return this;
        } // заполнятель поля age для инстанса Builder

        public Builder weight(int weight){
            this.weight=weight;
            return this;
        } // заполнятель поля weight для инстанса Builder

        public Builder height(int height){
            this.height=height;
            return this;
        }  // заполнятель поля height для инстанса Builder

        public Person build(){
            return new Person(this);
        } // метод порождающий инстанс Person на базе заполненого инстанса Builder

    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
