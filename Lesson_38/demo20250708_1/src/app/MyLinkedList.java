package app;

public class MyLinkedList extends MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Person person) {
        if (head == null){
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
    public void add(Person person, int index) {
        if (index>=size){
            add(person);
        } else if (index<=0){
            addFirst(person);
        } else {
            Node nextNode = getNodeByIndex(index);
            Node prevNode = nextNode.prev;
            Node newNode = new Node(prevNode, person,nextNode);
            size++;
            prevNode.next = newNode;
            nextNode.prev = newNode;


        }
    }

    private void addFirst(Person person) {
        Node newNode = new Node(null, person,head);
        head.prev = newNode;
        head = newNode;
        size++;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index>=size ) {
            return null;
        } else {
            return getNodeByIndex(index).value;
        }

    }



    private Node getNodeByIndex(int index) {
        Node currenNode = head;
        int counter = 0;
        while (counter<index && currenNode!=null){
            currenNode = currenNode.next;
            counter++;
        }
        return currenNode;
    }

    public String toString(){
        String res="";
        Node currentNode = head;
        while (currentNode!=null){
            res += currentNode.value + System.lineSeparator();
            currentNode = currentNode.next;
        }
        return res;
    }

    @Override
    public int indexOf(Person person) {
        Node currentNode = head;
        int index = 0;
        while (currentNode!=null){

            if (currentNode.value.equals(person)){
                return index;
            }

            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }




    class Node{

        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

    }

}
