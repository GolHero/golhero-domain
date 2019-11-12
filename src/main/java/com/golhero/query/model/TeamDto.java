package com.golhero.query.model;

import java.util.List;

public final class TeamDto {

    private final long id;

    private final String name;

    private final List<PlayerDto> players;

    public TeamDto(long id, String name, List<PlayerDto> players) {
        this.id = id;
        this.name = name;
        this.players = List.copyOf(players);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PlayerDto> getPlayers() {
        return List.copyOf(players);
    }

    @Override
    public String toString() {
        return "TeamDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
