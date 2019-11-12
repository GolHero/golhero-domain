package com.golhero.domain.model;

import java.util.Objects;

public final class PlayerId {

    private final long value;

    public PlayerId(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerId playerId = (PlayerId) o;
        return value == playerId.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "PlayerId{" +
                "value=" + value +
                '}';
    }
}
