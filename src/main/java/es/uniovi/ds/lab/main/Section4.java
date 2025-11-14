package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.model.*;

public class Section4 {

    public static void main(String[] args) throws Exception {

        Team homeTeam = new Team("Lucareños", linkedListOf("Homer", "Hank", "Harry"));
        Team awayTeam = new Team("Negreira Boys", linkedListOf("Arnold", "Aaron", "Albert"));

        Match match = new Match(homeTeam, awayTeam);
        match.play();

        /*
        1. Review the Team and Match classes. Improve them if necessary.
        
        2. Change Team so that it stores the "players" in a MyVector instead of MyLinkedList.
        - In view of the changes to be made, do you think your design was good? Why or why not?
        
        3. Change Team again so that the "players" are now stored in a MyDoubleList instead of a MyVector.
        - Did you have to change the Match class for this?
        
        4. Change the previous code in order to load the player names from "TeamA.txt" and "TeamB.txt" respectively.
        */
    }
}
