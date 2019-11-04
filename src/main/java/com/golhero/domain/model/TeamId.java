package com.golhero.domain.model;

import java.util.Objects;

public final class TeamId {

    private final int value;

    public TeamId(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamId teamId = (TeamId) o;
        return value == teamId.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "TeamId{" +
                "value=" + value +
                '}';
    }
}
