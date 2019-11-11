package com.golhero.domain.model;

import java.util.List;
import java.util.Objects;

public final class Match {

    private MatchId id;

    private TeamId teamA;

    private TeamId teamB;

    private List<PlayerId> playersA;

    private List<PlayerId> playersB;

    private ChampionshipId championshipId;

    private long timestamp;

    private int result;

    private int prediction;

    public Match(MatchId id,
                 TeamId teamA,
                 TeamId teamB,
                 List<PlayerId> playersA,
                 List<PlayerId> playersB,
                 ChampionshipId championshipId,
                 long timestamp,
                 int result,
                 int prediction) {
        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.playersA = playersA;
        this.playersB = playersB;
        this.championshipId = championshipId;
        this.timestamp = timestamp;
        this.result = result;
        this.prediction = prediction;
    }

    public Match(MatchId id,
                 TeamId teamA,
                 TeamId teamB,
                 ChampionshipId championshipId,
                 long timestamp,
                 int result) {
        this.id = id;
        this.teamA = teamA;
        this.teamB = teamB;
        this.championshipId = championshipId;
        this.timestamp = timestamp;
        this.result = result;
    }

    public MatchId getId() {
        return id;
    }

    public void setId(MatchId id) {
        this.id = id;
    }

    public TeamId getTeamA() {
        return teamA;
    }

    public void setTeamA(TeamId teamA) {
        this.teamA = teamA;
    }

    public TeamId getTeamB() {
        return teamB;
    }

    public void setTeamB(TeamId teamB) {
        this.teamB = teamB;
    }

    public List<PlayerId> getPlayersA() {
        return List.copyOf(playersA);
    }

    public void setPlayersA(List<PlayerId> playersA) {
        this.playersA = List.copyOf(playersA);
    }

    public List<PlayerId> getPlayersB() {
        return List.copyOf(playersB);
    }

    public void setPlayersB(List<PlayerId> playersB) {
        this.playersB = List.copyOf(playersB);
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getPrediction() {
        return prediction;
    }

    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }

    public ChampionshipId getChampionshipId() {
        return championshipId;
    }

    public void setChampionshipId(ChampionshipId championshipId) {
        this.championshipId = championshipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return Objects.equals(id, match.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
