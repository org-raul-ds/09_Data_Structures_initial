package es.uniovi.ds.lab.model;

import es.uniovi.ds.lab.structures.MyLinkedList;

public class Match {
    private Team homeTeam;
    private Team awayTeam;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team homeTeam() {
        return homeTeam;
    }

    public Team awayTeam() {
        return awayTeam;
    }

    public void play() {

        System.out.println(
                "Match between '" + homeTeam.getName() + "' and '" + awayTeam.getName() + "' is being played.");

        System.out.println("Home Team Players:");
        MyLinkedList homePlayers = homeTeam.players();
        printPlayers(homePlayers);

        System.out.println("Away Team Players:");
        MyLinkedList awayPlayers = awayTeam.players();
        printPlayers(awayPlayers);
    }

    private void printPlayers(MyLinkedList homePlayers) {
        for (int i = 0; i < homePlayers.size(); i++)
            System.out.println("- " + homePlayers.getString(i));
    }
}
