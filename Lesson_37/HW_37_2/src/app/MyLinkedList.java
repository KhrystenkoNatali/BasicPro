package app;

public class MyLinkedList extends MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        Person value;
        Node next;
        Node prev;

        Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public void add(Person person) {
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
    public int size() {
        return size;
    }

    @Override
    public Person get(int index) {
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
    public Integer indexOf(Person person) {
        Node currentNode = head;
        int index = 0;

        while (currentNode != null) {
            if (currentNode.value.equals(person)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return null;
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
