package es.uniovi.ds.lab.operations;

import es.uniovi.ds.lab.structures.Iterator;

public class Disk {

    public static void save(String fileName, Iterator iterator) {

        System.out.println("------------------------------------------------");
        System.out.println("Creating file " + fileName + "...");

        String line;
        while ((line = iterator.next()) != null)
            System.out.println(line);

        System.out.println("Closing file " + fileName + "...");
    }
}
