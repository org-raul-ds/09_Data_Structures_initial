package es.uniovi.ds.lab.operations;

import es.uniovi.ds.lab.structures.Iterator;

public class Printer {
    public static void print(Iterator iterator) {

        System.out.println("------------------------------------------------");
        System.out.println("Loading sheet...");

        String line;
        while ((line = iterator.next()) != null)
            System.out.println("Printing line: " + line);

        System.out.println("Ejecting page...");
    }
}
