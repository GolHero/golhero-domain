package com.golhero.domain.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Match {

    private MatchId id;

    private TeamId teamA;

    private TeamId teamB;

    private Map<TeamId, List<PlayerId>> players;

    private Map<TeamId, List<PlayerId>> reservePlayers;

    private ChampionshipId championshipId;

    private Map<TeamId, List<Substitution>> substitutions;

    private long timestamp;

    private int result;

    private int prediction;

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
        this.players = new HashMap<>();
        this.players.put(teamA, new ArrayList<>());
        this.players.put(teamB, new ArrayList<>());
        this.reservePlayers = new HashMap<>();
        this.reservePlayers.put(teamA, new ArrayList<>());
        this.reservePlayers.put(teamB, new ArrayList<>());
        this.substitutions = new HashMap<>();
        this.substitutions.put(teamA, new ArrayList<>());
        this.substitutions.put(teamB, new ArrayList<>());
    }

    public void addSubstitution(TeamId teamId, PlayerId playerIn, PlayerId playerOut) {
        if(!teamA.equals(teamId) && !teamB.equals(teamId)) {
            throw new IllegalArgumentException("teamId must be in the match");
        }

        List<PlayerId> players = this.players.get(teamId);
        List<PlayerId> reservePlayers = this.reservePlayers.get(teamId);

        if (!reservePlayers.contains(playerIn)) {
            throw new IllegalArgumentException("Player in must be in reserve players");
        }

        if (reservePlayers.contains(playerOut)) {
            throw new IllegalArgumentException("Player out must not be in reserve players");
        }

        if (!players.contains(playerIn) || !players.contains(playerOut)) {
            throw new IllegalArgumentException("player in and player out must be in team");
        }

        List<Substitution> substitutions = this.substitutions.get(teamId);

        long count = substitutions.stream()
                .filter(s -> s.getPlayerIn().equals(playerIn) || s.getPlayerOut().equals(playerOut))
                .count();

        if (count > 0) {
            throw new IllegalArgumentException("Illegal substitution");
        }

        substitutions.add(new Substitution(teamId, playerIn, playerOut));
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
        return List.copyOf(players.get(teamA));
    }

    public List<PlayerId> getPlayersB() {
        return List.copyOf(players.get(teamB));
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
