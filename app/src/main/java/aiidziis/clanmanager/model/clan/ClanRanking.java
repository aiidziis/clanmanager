package aiidziis.clanmanager.model.clan;

import aiidziis.clanmanager.model.Location;
import aiidziis.clanmanager.model.UrlContainer;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains data about clan rankings.
 */
public class ClanRanking {
    public final String tag;
    public final String name;
    public final Location location;
    public final UrlContainer badgeUrls;
    public final int clanLevel;
    public final int clanPoints;
    public final int members;
    public final int rank;
    public final int previousRank;

    public ClanRanking(String tag, String name, Location location, UrlContainer badgeUrls,
                       int clanLevel, int clanPoints, int members, int rank, int previousRank) {
        this.tag = tag;
        this.name = name;
        this.location = location;
        this.badgeUrls = badgeUrls;
        this.clanLevel = clanLevel;
        this.clanPoints = clanPoints;
        this.members = members;
        this.rank = rank;
        this.previousRank = previousRank;
    }
}
