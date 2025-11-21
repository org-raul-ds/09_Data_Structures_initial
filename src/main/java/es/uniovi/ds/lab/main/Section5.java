package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.util.Util.*;

public class Section5 {

    public static void main(String[] args) {

        var vector = vectorOf("Victor", "Valentin", "Vidal", "Viviana");
        var linkedList = linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");

        // $ Task A -----------------------------------------------------------
        System.out.println("\n\n## Task A");

        // Print the vector names in uppercase on the printer.
        // print...

        // Print only the first four characters of the list names on the printer.
        // print...

        // Print the vector names preceded by "Mr. " on the printer.
        // print...

        // $ Task B -----------------------------------------------------------
        System.out.println("\n\n## Task B");

        // Print the vector names that have exactly 5 characters on the printer.
        // print...

        // Print the list names that have a 'u' in their first two letters on the printer.
        // print...

        // $ Task C -----------------------------------------------------------
        System.out.println("\n\n## Task C");

        // Print the list names with length 7 on the printer. These should be printed in uppercase and preceded by "Mr. ".
        // print...
    }
}

/* Expected Output:

## Task A
------------------------------------------------
Loading sheet...
Printing line: VICTOR
Printing line: VALENTIN
Printing line: VIDAL
Printing line: VIVIANA
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Luca
Printing line: Lean
Printing line: Lore
Printing line: Luis
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Mr. Victor
Printing line: Mr. Valentin
Printing line: Mr. Vidal
Printing line: Mr. Viviana
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: VICTOR
Printing line: VALENTIN
Printing line: VIDAL
Printing line: VIVIANA
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Luca
Printing line: Lean
Printing line: Lore
Printing line: Luis
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Mr. Victor
Printing line: Mr. Valentin
Printing line: Mr. Vidal
Printing line: Mr. Viviana
Ejecting page


## Task B
------------------------------------------------
Loading sheet...
Printing line: Vidal
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Lucas
Printing line: Luis
Ejecting page


## Task C
------------------------------------------------
Loading sheet...
Printing line: Mr. LEANDRO
Printing line: Mr. LORENZO
Ejecting page
*/
