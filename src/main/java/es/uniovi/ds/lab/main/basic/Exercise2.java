package es.uniovi.ds.lab.main.basic;

import static es.uniovi.ds.lab.operations.Disk.*;

import es.uniovi.ds.lab.structures.MyVector;

public class Exercise2 {

    public static void main(String[] args) throws Exception {

        MyVector fileVector = loadFile("file.txt");
        save("newFile.txt", fileVector);

        // ------------------------------------------------
        // The previous solution loads the entire file into memory. This could be a problem if the file is very large.
        // How could we copy line by line without loading the entire file into memory?
        // save..."newFile.txt"..."file.txt"...

        // ------------------------------------------------
        // How could we generate the HTML without the server having to load the entire "file.txt" into memory?
        // writeHTML..."file.txt"...

        // ------------------------------------------------
        // How could we send to the printer the file "file.txt" without loading it entirely into memory?
        // sendToPrinter..."file.txt"...
    }
}
