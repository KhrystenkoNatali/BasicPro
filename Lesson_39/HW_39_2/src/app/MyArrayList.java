package app;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E> {
    private Object[] array = new Object[5];
    private int size = 0;

    public void add(E element) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = element;
    }

    private void enlarge() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) return null;
        return (E) array[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
        private int currentIndex = 0;
        private boolean canRemove = false;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            canRemove = true;
            return (E) array[currentIndex++];
        }

        @Override
        public void remove() {
            if (!canRemove) throw new IllegalStateException();
            for (int i = currentIndex - 1; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
            currentIndex--;
            canRemove = false;
        }
    }
}
