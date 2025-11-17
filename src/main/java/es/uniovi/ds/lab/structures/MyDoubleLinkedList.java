package es.uniovi.ds.lab.structures;

class DoubleLinkNode {
    String text;
    DoubleLinkNode prev;
    DoubleLinkNode next;

    public DoubleLinkNode(String text, DoubleLinkNode prev, DoubleLinkNode next) {
        this.text = text;
        this.next = next;
        this.prev = prev;
    }
}

public class MyDoubleLinkedList {

    private DoubleLinkNode head;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        head = new DoubleLinkNode(text, null, head);
        if (head.next != null)
            head.next.prev = head;
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
