package es.uniovi.ds.lab.structures;

class DoubleLinkNode {
    String text;
    DoubleLinkNode next;
    DoubleLinkNode prev;
}

public class MyDoubleLinkedList {

    private DoubleLinkNode head;
    private DoubleLinkNode tail;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        DoubleLinkNode newNode = new DoubleLinkNode();
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

        DoubleLinkNode current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        return current.text;
    }
}
