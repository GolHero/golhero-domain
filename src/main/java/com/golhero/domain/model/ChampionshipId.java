package com.golhero.domain.model;

import java.util.Objects;

public final class ChampionshipId {

    private final int value;

    public ChampionshipId(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChampionshipId that = (ChampionshipId) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ChampionshipId{" +
                "value=" + value +
                '}';
    }
}
