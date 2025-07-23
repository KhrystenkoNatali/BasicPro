package app;

public class MyLinkedListProduct extends MyListProduct {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        Product value;
        Node next;
        Node prev;

        Node(Node prev, Product value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Product product) {
        if (head == null) {
            Node node = new Node(null, product, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(tail, product, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public Product get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
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
    public String toString() {
        String res = "";
        Node currentNode = head;
        while (currentNode != null) {
            res += currentNode.value + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
    }
}
