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

        // 2. Create a file "All home team players.txt" containing the home team starters and substitutes.
        // save("All home team players.txt" ... match.homeTeam().players() ... "Home team substitutes.txt"...

        // 3. Find the first away team player whose name starts with 'A' and print it to the console. Search starters first, then substitutes if not found.
        // String startsWithA = findFirst(...match.awayTeam().players()..."Away team substitutes.txt"...
        // System.out.println("\n\nFirst away team player whose name starts with 'A': " + startsWithA + "\n");

        // 4. Send to the printer the names of starting players from both teams in UPPERCASE.
        // sendToPrinter(...match.homeTeam().players() ... match.awayTeam().players()...
    }

}

/*
Creating file 'Both teams starters.txt'
Harry
Milhouse
Bartolomew
Bill
Peter
Johansson
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
Loading sheet...
Printing line: HARRY
Printing line: MILHOUSE
Printing line: BARTOLOMEW
Printing line: BILL
Printing line: PETER
Printing line: JOHANSSON
Ejecting page
*/
