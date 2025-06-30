package app;

public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public  String getName(){
        return fName + " " + lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void  setAge(int age){
        if(age>this.age){
            this.age = age;
        }
    }

    public  void birthday(){
        this.age++; // this.age = this.age + 1;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return getName() + " (" + age +")";
    }



}
