package es.uniovi.ds.lab.structures;

class SingleLinkNode {
    String text;
    SingleLinkNode next;
}

public class MyLinkedList {

    private SingleLinkNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        SingleLinkNode newNode = new SingleLinkNode();
        newNode.text = text;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public String getString(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        SingleLinkNode current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        return current.text;
    }
}
