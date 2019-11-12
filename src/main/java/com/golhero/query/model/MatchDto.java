package com.golhero.query.model;

public final class MatchDto {

    private final long id;

    private final long teamAId;

    private final String teamAName;

    private final int teamAScore;

    private final long teamBId;

    private final String teamBName;

    private final int teamBScore;

    private final long timestamp;

    private final long winnerId;

    public MatchDto(long id,
                    long teamAId,
                    String teamAName,
                    int teamAScore,
                    long teamBId,
                    String teamBName,
                    int teamBScore,
                    long timestamp) {
        this.id = id;
        this.teamAId = teamAId;
        this.teamAName = teamAName;
        this.teamAScore = teamAScore;
        this.teamBId = teamBId;
        this.teamBName = teamBName;
        this.teamBScore = teamBScore;
        this.timestamp = timestamp;
        this.winnerId = teamAScore > teamBScore ? teamAId : teamAScore < teamBScore ? teamBId : 0;
    }

    public long getId() {
        return id;
    }

    public long getTeamAId() {
        return teamAId;
    }

    public String getTeamAName() {
        return teamAName;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public long getTeamBId() {
        return teamBId;
    }

    public String getTeamBName() {
        return teamBName;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getWinnerId() {
        return winnerId;
    }

    @Override
    public String toString() {
        return "MatchDto{" +
                "id=" + id +
                ", teamAId=" + teamAId +
                ", teamAName='" + teamAName + '\'' +
                ", teamAScore=" + teamAScore +
                ", teamBId=" + teamBId +
                ", teamBName='" + teamBName + '\'' +
                ", teamBScore=" + teamBScore +
                ", timestamp=" + timestamp +
                ", winnerId=" + winnerId +
                '}';
    }
}
