package es.uniovi.ds.lab.operations;

import es.uniovi.ds.lab.structures.*;

public class Printer {
    public static void sendToPrinter(MyDoubleLinkedList doubleList) {

        System.out.println("------------------------------------------------");
        System.out.println("Loading sheet...");

        for (int i = 0; i < doubleList.size(); i++)
            System.out.println("Printing line: " + doubleList.getNode(i));

        System.out.println("Ejecting page");
    }
}
