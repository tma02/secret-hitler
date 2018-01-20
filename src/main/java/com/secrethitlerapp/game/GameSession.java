package com.secrethitlerapp.game;

import java.util.ArrayList;

public class GameSession {

    private ArrayList<Player> players;
    private int lastPresidentIndex;
    private int presidentIndex;
    private int lastChancellorIndex;
    private int chancellorIndex;
    private int liberalPolicies;
    private int fascistPolicies;
    private int failedElections;

    public GameSession() {
        this.players = new ArrayList<>(8);
        this.lastPresidentIndex = -1;
        this.presidentIndex = -1;
        this.lastChancellorIndex = -1;
        this.chancellorIndex = -1;
        this.liberalPolicies = 0;
        this.fascistPolicies = 0;
        this.failedElections = 0;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

}
