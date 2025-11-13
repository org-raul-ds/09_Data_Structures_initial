package es.uniovi.ds.lab.structures;

class Node {
    String text;
    Node next;
}

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        Node newNode = new Node();
        newNode.text = text;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public String getString(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        return current.text;
    }

    public Iterator iterator() {
        return new LinkedListIterator(head);
    }
}

class LinkedListIterator implements Iterator {
    private Node current;

    public LinkedListIterator(Node head) {
        current = head;
    }

    @Override
    public String next() {
        if (current == null)
            return null;

        String text = current.text;
        current = current.next;
        return text;
    }
}
