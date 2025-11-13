package es.uniovi.ds.lab.structures;

class Node {
    String text;
    Node next;
    Node prev;
}

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        Node newNode = new Node();
        newNode.text = text;
        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;
        else
            tail = newNode; // If the list was empty, tail is also the new node

        head = newNode;
        size++;
    }

    public String getNode(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        return current.text;
    }

    public Iterator iterator() {
        return new DoubleLinkedListIterator(head);
    }
}

class DoubleLinkedListIterator implements Iterator {
    private Node current;

    public DoubleLinkedListIterator(Node head) {
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
