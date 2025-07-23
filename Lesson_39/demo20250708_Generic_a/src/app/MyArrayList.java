package app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList<E> extends MyList<E> {
    private int size = 0;
    private Object[] array = new Object[5];

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = element;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return (E)array[index];
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
    public int indexOf(E element) {
        for (int i = 0; i < size ; i++) {
            if(array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}
