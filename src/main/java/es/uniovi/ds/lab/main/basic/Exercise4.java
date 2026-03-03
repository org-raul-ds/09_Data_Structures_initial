package es.uniovi.ds.lab.main.basic;

import static es.uniovi.ds.lab.main.TestsHelper.*;

import es.uniovi.ds.lab.model.*;

public class Exercise4 {

    public static void main(String[] args) throws Exception {

        Team homeTeam = new Team("Lucareños", linkedListOf("Homer", "Hank", "Harry"));
        Team awayTeam = new Team("Negreira Boys", linkedListOf("Arnold", "Aaron", "Albert"));

        Match match = new Match(homeTeam, awayTeam);
        match.play();

        /*
        1. Read the Team and Match classes.
        
        2. Change Team so that it stores the "players" in a MyVector instead of MyLinkedList.
            - In view of the changes to be made, do you think the design was good enough? why yes/no?
            - Change the design to make it better if you think it is necessary.
        
        3. Change Team again so that the "players" are now stored in a MyDoubleList instead of a MyVector.
            - Did you have to change the Match class for this?
        
        4. Finally, change the previous code in order to load the player names from "Home team substitutes.txt" and "Away team substitutes.txt" respectively.
        */
    }
}
