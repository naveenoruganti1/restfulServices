package com.cache.dto;

public class MatchScore {
	private String uniqueMatchNo;
	private String tournamentName;
	private String battingTeam;
	private String fieldingTeam;
	private float overs;
	private int score;
	private int wickets;

	public String getUniqueMatchNo() {
		return uniqueMatchNo;
	}

	public void setUniqueMatchNo(String uniqueMatchNo) {
		this.uniqueMatchNo = uniqueMatchNo;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getFieldingTeam() {
		return fieldingTeam;
	}

	public void setFieldingTeam(String fieldingTeam) {
		this.fieldingTeam = fieldingTeam;
	}

	public float getOvers() {
		return overs;
	}

	public void setOvers(float overs) {
		this.overs = overs;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battingTeam == null) ? 0 : battingTeam.hashCode());
		result = prime * result + ((fieldingTeam == null) ? 0 : fieldingTeam.hashCode());
		result = prime * result + Float.floatToIntBits(overs);
		result = prime * result + score;
		result = prime * result + ((tournamentName == null) ? 0 : tournamentName.hashCode());
		result = prime * result + ((uniqueMatchNo == null) ? 0 : uniqueMatchNo.hashCode());
		result = prime * result + wickets;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchScore other = (MatchScore) obj;
		if (battingTeam == null) {
			if (other.battingTeam != null)
				return false;
		} else if (!battingTeam.equals(other.battingTeam))
			return false;
		if (fieldingTeam == null) {
			if (other.fieldingTeam != null)
				return false;
		} else if (!fieldingTeam.equals(other.fieldingTeam))
			return false;
		if (Float.floatToIntBits(overs) != Float.floatToIntBits(other.overs))
			return false;
		if (score != other.score)
			return false;
		if (tournamentName == null) {
			if (other.tournamentName != null)
				return false;
		} else if (!tournamentName.equals(other.tournamentName))
			return false;
		if (uniqueMatchNo == null) {
			if (other.uniqueMatchNo != null)
				return false;
		} else if (!uniqueMatchNo.equals(other.uniqueMatchNo))
			return false;
		if (wickets != other.wickets)
			return false;
		return true;
	}

}
