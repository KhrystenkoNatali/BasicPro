package app;

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
        Person[] newArray = new Person[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index >= size) return null;
        return array[index];
    }

    @Override
    public Integer indexOf(Person person) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(person)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }
}
