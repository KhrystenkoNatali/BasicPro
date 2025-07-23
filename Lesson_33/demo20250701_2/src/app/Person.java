package app;

public class Person {
    private String name;
    private int id;
    private boolean flag=true;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public class LoginPasword{
        private String login;
        private int password;
        private boolean flag=false;

        public LoginPasword(){
            login=name;
            password=id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        public void display(){
            System.out.println("inner "+flag); // inner class field
            System.out.println("outer "+Person.this.flag); // outer class field
        }
    }


}
