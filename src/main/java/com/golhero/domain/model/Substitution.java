package com.golhero.domain.model;

import java.util.Objects;

public final class Substitution {

    private final TeamId teamId;

    private final PlayerId playerIn;

    private final PlayerId playerOut;

    public Substitution(TeamId teamId, PlayerId playerIn, PlayerId playerOut) {
        this.teamId = teamId;
        this.playerIn = playerIn;
        this.playerOut = playerOut;
    }

    public TeamId getTeamId() {
        return teamId;
    }

    public PlayerId getPlayerIn() {
        return playerIn;
    }

    public PlayerId getPlayerOut() {
        return playerOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Substitution that = (Substitution) o;
        return Objects.equals(teamId, that.teamId) &&
                Objects.equals(playerIn, that.playerIn) &&
                Objects.equals(playerOut, that.playerOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, playerIn, playerOut);
    }

    @Override
    public String toString() {
        return "Substitution{" +
                "teamId=" + teamId +
                ", playerIn=" + playerIn +
                ", playerOut=" + playerOut +
                '}';
    }
}
