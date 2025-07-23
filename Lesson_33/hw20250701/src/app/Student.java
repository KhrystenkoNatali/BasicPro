package app;

public class Student {
    private int id;
    private String name;
    private String group;
    private static int counter=0;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
        counter+=1;
        this.id=counter;
    }

    public Student(String name, String group, int id) {
        this.name = name;
        this.group = group;
        counter+=1;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static int howManyStudentsNow(){
        return counter;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name +
                ", group='" + group ;
    }

}
