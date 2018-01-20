package com.secrethitlerapp.game;

import java.util.UUID;

public class Player {

    private String name;
    private UUID uuid;
    private Role role;
    private Party party;

    public Player(String name, UUID uuid, Role role) {
        this.name = name;
        this.uuid = uuid;
        this.role = role;
        this.party = this.role.ordinal() == 0 ? Party.LIBERAL : Party.FASCIST;
    }

}
