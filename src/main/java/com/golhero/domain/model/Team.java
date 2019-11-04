package com.golhero.domain.model;

import java.util.List;
import java.util.Objects;

public final class Team {

    private TeamId id;

    private String name;

    private List<PlayerId> players;

    public Team(TeamId id, String name, List<PlayerId> players) {
        this.id = id;
        this.name = name;
        this.players = List.copyOf(players);
    }

    public TeamId getId() {
        return id;
    }

    public void setId(TeamId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlayerId> getPlayers() {
        return List.copyOf(players);
    }

    public void setPlayers(List<PlayerId> players) {
        this.players = List.copyOf(players);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
