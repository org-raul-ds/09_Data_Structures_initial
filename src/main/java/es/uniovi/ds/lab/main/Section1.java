package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.operations.HtmlGenerator.*;
import static es.uniovi.ds.lab.operations.Printer.*;
import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.structures.MyVector;

public class Section1 {

    public static void main(String[] args) throws Exception {

        var vector = vectorOf("Victor", "Valentin", "Vidal", "Viviana");
        save("vector.txt", vector);

        var linkedList = linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");
        writeHTML(linkedList);

        var doubleList = doubleLinkedListOf("Daniel", "Diego", "Damián", "Domingo");
        print(doubleList);

        // ------------------------------------------------
        // Now I want to write the vector in HTML
        // writeHTML(vector);

        // ------------------------------------------------
        // Now I want to print the linked list on the printer
        // print(linkedList);

        // ------------------------------------------------
        // Now I want to save the DOUBLE linked list to the file "doble.txt"
        // save("doble.txt", doubleList);

        // ------------------------------------------------
        // Now I want to print the contents of the file "file.txt" on the printer
        MyVector fileVector = loadFile("file.txt");
        // print(fileVector);

    }
}
