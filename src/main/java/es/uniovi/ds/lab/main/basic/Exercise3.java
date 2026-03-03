package es.uniovi.ds.lab.main.basic;

import static es.uniovi.ds.lab.main.Util.*;
import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.operations.Printer.*;

import java.io.IOException;

import es.uniovi.ds.lab.structures.*;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        var vector = vectorOf("Victor", "Valentin", "Vidal");
        var linkedList = linkedListOf("Lucas", "Leandro", "Lorenzo");

        // ------------------------------------------------
        // Now I want to have a copy of "vector" in another vector "vector2" to be able to modify it

        // MyVector vector2 = <put all elements from "vector">
        // sendToPrinter ...vector2...

        // ------------------------------------------------
        // Now I want to pass the elements from "vector2" to a doubly linked list "doubleList2"

        // MyDoubleLinkedList doubleList2 = <put all elements from "vector2">
        // sendToPrinter ...doubleList2...

        // ------------------------------------------------
        // I want to copy the elements from "doubleList2" to a vector "vector3"

        // MyVector vector3 = <put all elements from "doubleList2">
        // sendToPrinter ...vector3...

        // ------------------------------------------------
        // Now I want to have a copy of "linkedList" in another "linkedList2" to be able to modify it

        // MyLinkedList linkedList2 = <put all elements from "linkedList">
        // sendToPrinter ...linkedList2...

        // ------------------------------------------------
        // Finally, I want to load the lines from the file "file.txt" into a doubly linked list "doubleList3"

        // MyDoubleLinkedList doubleList3 = <put all elements from "file.txt">
        // sendToPrinter ...doubleList3...

    }
}
