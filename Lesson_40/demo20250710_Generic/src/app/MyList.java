package app;

// for Person
public abstract class MyList<E> implements Iterable<E> {
    int size() {
        return 0;
    }

    void add(E element) {

    }

    void add(E element, int index){
        System.out.println("метод не реализован");
    };

    E get(int index) {
        return null;
    }

    int indexOf(E element) {
        return 0;
    }
}
