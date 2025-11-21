package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.model.*;

public class Section6 {

    public static void main(String[] args) throws Exception {

        Match match = new Match(
                new Team("Lucareños", linkedListOf("Bartolomew", "Milhouse", "Harry")),
                new Team("Negreira Boys", linkedListOf("Johansson", "Aaron", "Albert")));

        // 1. Save the names of ALL players from both teams together in a single file "All Players.txt" (the order doesn't matter)
        // save("All players.txt"...

        // 2. Find the first player whose name starts with 'A' and display it on the console. Search first in the home team and if not found, search in the away team.
        // String startsWithA = ...
        // System.out.println("\n\nFirst player whose name starts with 'A': " + startsWithA);

        // 3. Save to a file "Big Players.txt" the names of players from both teams whose name has more than 6 letters (the order doesn't matter). Print the names in uppercase.
        // save("Big players.txt"...

        // 4. Create a file "Both files.txt" that contains the content of the files "TeamA.txt" and "TeamB.txt"
        // save("Both files.txt", ..."TeamA.txt"..."TeamB.txt"...
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
*/
