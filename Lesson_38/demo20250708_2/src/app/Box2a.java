package app;
/*
T - type
E - element
R - result
V - value
K - key
 */
public class Box2a<T> {
    private T value;

    public Box2a(T value) {
        this.value = value;
    }

    @Override
    public java.lang.String toString() {
        return "Box2{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
