package app;

import java.util.Arrays;

public class MyArrayList extends MyList {
    private int size = 0;
    private Person[] array = new Person[5];


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Person person) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = person;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    @Override
    public Person get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }



    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }

    @Override
    public int indexOf(Person person) {
        for (int i = 0; i < size ; i++) {
            if(array[i].equals(person)){
                return i;
            }
        }
        return -1;
    }
}
