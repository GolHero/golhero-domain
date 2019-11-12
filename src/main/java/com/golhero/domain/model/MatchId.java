package com.golhero.domain.model;

import java.util.Objects;

public final class MatchId {

    private final long value;

    public MatchId(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchId matchId = (MatchId) o;
        return value == matchId.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "MatchId{" +
                "value=" + value +
                '}';
    }
}
