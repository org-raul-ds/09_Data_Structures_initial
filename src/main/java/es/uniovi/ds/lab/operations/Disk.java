package es.uniovi.ds.lab.operations;

import java.io.*;
import java.util.Scanner;

import es.uniovi.ds.lab.structures.*;

public class Disk {

    public static void save(String fileName, MyVector vector) {

        System.out.println("------------------------------------------------");
        System.out.println("Creating file '" + fileName + "'");

        for (int i = 0; i < vector.size(); i++)
            System.out.println("Writing line: " + vector.get(i));

        System.out.println("Closing file");
    }

    public static MyVector loadFile(String fileName) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader(fileName));

        MyVector vector = new MyVector();
        while (scanner.hasNextLine())
            vector.add(scanner.nextLine());

        scanner.close();
        return vector;
    }

}
