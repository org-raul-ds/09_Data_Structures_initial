package es.uniovi.ds.lab.structures;

public class MyVector {
    private String[] elements;
    private int size;
    private static final int DEFAULT_VECTOR_SIZE = 20;

    public MyVector() {
        this(DEFAULT_VECTOR_SIZE);
    }

    public MyVector(int capacity) {
        elements = new String[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String text) {
        if (size == elements.length)
            throw new IndexOutOfBoundsException("Vector is full. Cannot add more elements.");

        elements[size] = text;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }
}
