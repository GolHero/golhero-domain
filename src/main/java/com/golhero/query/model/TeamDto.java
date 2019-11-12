package com.golhero.query.model;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamDto teamDto = (TeamDto) o;
        return id == teamDto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
