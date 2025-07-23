package app;

public class MainNestedClass {
    public static void main(String[] args) {

        Person p =new Person("Vasya",10);
        Person.LoginPasword lp= p.new LoginPasword();

        Person.LoginPasword lp1= new Person("Kolya",15).new LoginPasword();
        System.out.println(lp1.getLogin());
        System.out.println(lp1.getPassword());

        lp.display();

    }

}
