package es.uniovi.ds.lab.model;

import es.uniovi.ds.lab.structures.MyLinkedList;

public class Team {
    private String name;
    private MyLinkedList players;

    public Team(String name, MyLinkedList players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public MyLinkedList players() {
        return players;
    }
}
