package es.uniovi.ds.lab.util;

import es.uniovi.ds.lab.structures.*;

/**
 * Don't modify this class. It is only used for testing purposes.
 */
public class Util {

    public static Vector vectorOf(String... elements) {
        Vector vector = new Vector();
        for (String element : elements)
            vector.add(element);
        return vector;
    }

    public static Vector exampleVector() {
        return vectorOf("Amadeo", "Baldomero", "Cipriano", "Desiderio", "Eustaquio");
    }

    public static LinkedList linkedListOf(String... elements) {
        LinkedList list = new LinkedList();
        for (int i = elements.length - 1; i >= 0; i--)
            list.add(elements[i]);
        return list;
    }

    public static LinkedList exampleLinkedList() {
        return linkedListOf("Aniceto", "Braulio", "Crisanto", "Demetrio", "Epifanio");
    }

    public static DoubleLinkedList doubleLinkedListOf(String... elements) {
        DoubleLinkedList list = new DoubleLinkedList();
        for (int i = elements.length - 1; i >= 0; i--)
            list.add(elements[i]);
        return list;
    }

    public static DoubleLinkedList exampleDoubleList() {
        return doubleLinkedListOf("Alcibíades", "Bartolomé", "Casimiro", "Diógenes", "Ezequiel");
    }
}
