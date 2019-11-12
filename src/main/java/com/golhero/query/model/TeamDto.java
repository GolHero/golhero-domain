package com.golhero.query.model;

import java.util.Objects;
import java.util.Set;

public final class TeamDto {

    private final long id;

    private final String name;

    private final Set<PlayerDto> players;

    public TeamDto(long id, String name, Set<PlayerDto> players) {
        this.id = id;
        this.name = name;
        this.players = Set.copyOf(players);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<PlayerDto> getPlayers() {
        return Set.copyOf(players);
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
