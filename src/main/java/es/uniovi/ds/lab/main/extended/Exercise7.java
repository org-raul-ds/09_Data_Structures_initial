package es.uniovi.ds.lab.main.extended;

import static es.uniovi.ds.lab.main.TestsHelper.*;
import static es.uniovi.ds.lab.operations.Disk.*;

import es.uniovi.ds.lab.model.*;

public class Exercise7 {

    public static void main(String[] args) throws Exception {

        // Starting players for both teams
        Match match = new Match(
                new Team("Lucareños", linkedListOf("Bartolomew", "Milhouse", "Harry")),
                new Team("Negreira Boys", linkedListOf("Johansson", "Aaron", "Albert")));

        // 1. Save the starting players from both teams together in a single file named "Both teams starters.txt" (order doesn't matter).
        // save("Both teams starters.txt"...match.homeTeam().players()...match.awayTeam().players()...

        // 2. Create a file "Both teams substitutes.txt" containing the contents of "Home team substitutes.txt" and "Away team substitutes.txt".
        // save("Both teams substitutes.txt", ..."Home team substitutes.txt"..."Away team substitutes.txt"...

        // 3. Create a file "All home team players.txt" containing the home team starters and substitutes.
        // save("All home team players.txt" ... match.homeTeam().players() ... "Home team substitutes.txt"...

        // 4. Find the first away team player whose name starts with 'A' and print it to the console. Search starters first, then substitutes if not found.
        // String startsWithA = ...match.awayTeam().players()..."Away team substitutes.txt"...
        // System.out.println("\n\nFirst away team player whose name starts with 'A': " + startsWithA + "\n");

        // 5. Save to file "Big starter players.txt" the names of starting players from both teams with more than 6 letters (order doesn't matter), in uppercase.
        // save("Big starter players.txt"...match.homeTeam().players() ... match.awayTeam().players()...
    }
}

/*
------------------------------------------------
Creating file 'Both teams starters.txt'
Harry
Milhouse
Bartolomew
Bill
Peter
Johansson
[Closing file]
------------------------------------------------
Creating file 'Both teams substitutes.txt'
Homer
Hank
Henry
Arnold
Arthur
Adam
[Closing file]
------------------------------------------------
Creating file 'All home team players.txt'
Harry
Milhouse
Bartolomew
Homer
Hank
Henry
[Closing file]


First away team player whose name starts with 'A': Arnold

------------------------------------------------
Creating file 'Big starter players.txt'
MILHOUSE
BARTOLOMEW
JOHANSSON
[Closing file]
------------------------------------------------
Creating file 'Big starter players.txt'
MILHOUSE
BARTOLOMEW
JOHANSSON
[Closing file]
*/
