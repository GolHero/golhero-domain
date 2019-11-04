package com.golhero.domain.model;

import java.util.List;

public final class Match {

    private TeamId teamA;

    private TeamId teamB;

    private List<PlayerId> playersA;

    private List<PlayerId> playersB;

    private long timestamp;

    private int result;

    private int prediction;

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
}
