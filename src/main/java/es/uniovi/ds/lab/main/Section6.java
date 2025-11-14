package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.operations.Disk.*;
import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.model.*;

public class Section6 {

    public static void main(String[] args) throws Exception {

        Team homeTeam = new Team("Lucasencos", linkedListOf("Bartolomew", "Milhouse", "Harry"));
        Team awayTeam = new Team("Negreira Boys", linkedListOf("Johansson", "Aaron", "Albert"));

        Match match = new Match(homeTeam, awayTeam);

        // Save the names of ALL players from both teams together in a single file "All Players.txt" (the order doesn't matter)
        // save("All players.txt", ...

        // Save to a file "Big Players.txt" the names of players from both teams whose name has more than 6 letters. Print the names in uppercase.
        // save("Big players.txt", ...

        // Create a file "Both files.txt" that contains the content of the files "TeamA.txt" and "TeamB.txt"
        // save("Both files.txt", ..."TeamA.txt"..."TeamB.txt"

    }
}

/*
Expected output (the order doesn't matter):

------------------------------------------------ Vector to file
Creating file 'All Players.txt'
Harry
Milhouse
Bartolomew
Albert
Aaron
Johansson
Closing file
------------------------------------------------ Vector to file
Creating file 'Big Players.txt'
MILHOUSE
BARTOLOMEW
JOHANSSON
Closing file
------------------------------------------------ Vector to file
Creating file 'Both files.txt'
Homer
Hank
Harry
Arnold
Aaron
Albert
Closing file
*/
