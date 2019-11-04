package com.golhero.domain.model;

import java.util.Objects;

public final class Player {

    private PlayerId id;

    private String name;

    public Player(PlayerId id, String name) {
        this.id = id;
        this.name = name;
    }

    public PlayerId getId() {
        return id;
    }

    public void setId(PlayerId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
