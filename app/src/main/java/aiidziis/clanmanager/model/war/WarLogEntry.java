package aiidziis.clanmanager.model.war;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains war log entries.
 */
public class WarLogEntry {
    public final String result;
    public final String endTime;
    public final int teamSize;
    public final WarClan clan;
    public final WarClan opponent;

    public WarLogEntry(String result, String endTime, int teamSize, WarClan clan, WarClan opponent) {
        this.result = result;
        this.endTime = endTime;
        this.teamSize = teamSize;
        this.clan = clan;
        this.opponent = opponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WarLogEntry)) return false;

        WarLogEntry that = (WarLogEntry) o;

        if (teamSize != that.teamSize) return false;
        if (!result.equals(that.result)) return false;
        if (!endTime.equals(that.endTime)) return false;
        if (!clan.equals(that.clan)) return false;
        return opponent.equals(that.opponent);

    }

    @Override
    public int hashCode() {
        int result1 = result.hashCode();
        result1 = 31 * result1 + endTime.hashCode();
        result1 = 31 * result1 + teamSize;
        result1 = 31 * result1 + clan.hashCode();
        result1 = 31 * result1 + opponent.hashCode();
        return result1;
    }

    @Override
    public String toString() {
        return "WarLogEntry{" +
                "result='" + result + '\'' +
                ", endTime='" + endTime + '\'' +
                ", teamSize=" + teamSize +
                ", clan=" + clan +
                ", opponent=" + opponent +
                '}';
    }
}
