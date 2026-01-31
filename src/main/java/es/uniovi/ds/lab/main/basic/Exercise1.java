package es.uniovi.ds.lab.main.basic;

import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.operations.HtmlGenerator.*;
import static es.uniovi.ds.lab.operations.Printer.*;
import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.structures.MyVector;

public class Exercise1 {

    public static void main(String[] args) throws Exception {

        var vector = vectorOf("Victor", "Valentin", "Vidal", "Viviana");
        save("vector.txt", vector);

        var linkedList = linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");
        writeHTML(linkedList);

        var doubleList = doubleLinkedListOf("Daniel", "Diego", "Damián", "Domingo");
        sendToPrinter(doubleList);

        // ------------------------------------------------
        // Now I want to write the vector in HTML
        // writeHTML...vector...

        // ------------------------------------------------
        // Now I want to print the linked list on the printer
        // sendToPrinter...linkedList...

        // ------------------------------------------------
        // Now I want to save the DOUBLE linked list to the file "doble.txt"
        // save..."doble.txt"...doubleList...

        // ------------------------------------------------
        // Now I want to print the contents of the file "file.txt" on the printer
        MyVector fileVector = loadFile("file.txt");
        // sendToPrinter...fileVector...
    }
}

/*
Expected output (the order doesn't matter):

------------------------------------------------
Creating file 'All players.txt'
Harry
Milhouse
Bartolomew
Albert
Aaron
Johansson
Closing file


First player whose name starts with 'A': Albert
------------------------------------------------
Creating file 'Big players.txt'
MILHOUSE
BARTOLOMEW
JOHANSSON
Closing file
------------------------------------------------
Creating file 'Both files.txt'
Homer
Hank
Harry
Arnold
Aaron
Albert
Closing file
------------------------------------------------
Creating file 'Mix.txt'
Harry
Milhouse
Bartolomew
Homer
Hank
Harry
Closing file
*/
