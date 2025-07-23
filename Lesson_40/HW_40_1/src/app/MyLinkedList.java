package app;

import app.model.Product;
import java.util.Iterator;

public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Product person) {
        if (head == null) {
            Node node = new Node(null, person, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(tail, person, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public Product get(int index) {
        if (index < 0 || index >= size) return null;
        return getNodeByIndex(index).value;
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = head;
        int counter = 0;
        while (counter < index && currentNode != null) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    @Override
    public Iterator<Product> iterator() {
        return new Iterator<>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Product next() {
                Product value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    class Node {
        private Node prev;
        private Product value;
        private Node next;

        public Node(Node prev, Product value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node current = head;
        while (current != null) {
            res.append(current.value).append(System.lineSeparator());
            current = current.next;
        }
        return res.toString();
    }
}
