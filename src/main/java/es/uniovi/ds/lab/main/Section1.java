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
        // Ahora quiero escribir el vector en Html
        // writeHTML(vector);

        // ------------------------------------------------
        // Ahora quiero imprimir la lista enlazada en la impresora
        // print(linkedList);

        // ------------------------------------------------
        // Ahora quiero guardar en el fichero "doble.txt" la lista DOBLE enlazada
        // save("doble.txt", doubleList);

        // ------------------------------------------------
        // Ahora quiero imprimir en la impresora el contenido del fichero "database.txt"
        MyVector fileVector = loadFile("file.txt");
        // print(fileVector);

    }
}
