package app;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int ageCompare = Integer.compare(p1.getAge(), p2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        }
        return p1.getName().compareTo(p2.getName());
    }

}
