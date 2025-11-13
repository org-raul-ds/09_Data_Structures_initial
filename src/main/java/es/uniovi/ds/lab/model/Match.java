package es.uniovi.ds.lab.model;

import es.uniovi.ds.lab.structures.MyLinkedList;

public class Match {
    private Team homeTeam;
    private Team awayTeam;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void play() {

        System.out.println(
                "Match between '" + homeTeam.getName() + "' and '" + awayTeam.getName() + "' is being played.");

        System.out.println("Home Team Players:");
        MyLinkedList homePlayers = homeTeam.getPlayers();
        for (int i = 0; i < homePlayers.size(); i++)
            System.out.println("- " + homePlayers.getString(i));

        System.out.println("Away Team Players:");
        MyLinkedList awayPlayers = awayTeam.getPlayers();
        for (int i = 0; i < awayPlayers.size(); i++)
            System.out.println("- " + awayPlayers.getString(i));

    }
}
