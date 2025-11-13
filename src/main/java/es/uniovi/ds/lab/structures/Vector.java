package es.uniovi.ds.lab.structures;

public class Vector {
    private String[] elements;
    private int size;
    private static final int DEFAULT_VECTOR_SIZE = 20;

    public Vector() {
        this(DEFAULT_VECTOR_SIZE);
    }

    public Vector(int capacity) {
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

    public Iterator iterator() {
        return new VectorIterator(this);
    }
}

class VectorIterator implements Iterator {
    private int currentIndex;
    private Vector vector;

    public VectorIterator(Vector vector) {
        this.vector = vector;
        this.currentIndex = 0;
    }

    @Override
    public String next() {
        if (currentIndex >= vector.size()) {
            return null;
        }
        return vector.get(currentIndex++);
    }
}
