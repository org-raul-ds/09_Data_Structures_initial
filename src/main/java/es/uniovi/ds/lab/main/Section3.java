package es.uniovi.ds.lab.main;

import static es.uniovi.ds.lab.util.Util.*;

import es.uniovi.ds.lab.model.*;

public class Section3 {

    public static void main(String[] args) throws Exception {

        Team homeTeam = new Team("Lucasencos", linkedListOf("Homer", "Hank", "Harry"));
        Team awayTeam = new Team("Negreira Boys", linkedListOf("Arnold", "Aaron", "Albert"));

        Match match = new Match(homeTeam, awayTeam);
        match.play();
    }
}
