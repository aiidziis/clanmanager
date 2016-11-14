package aiidziis.clanmanager.model.clan;

import aiidziis.clanmanager.model.Location;
import aiidziis.clanmanager.model.UrlContainer;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains all data about clan.
 */
public class Clan {
    public final String tag;
    public final String name;
    public final Location location;
    public final UrlContainer badgeUrls;
    public final int clanLevel;
    public final int clanPoints;
    public final int members;
    public final String type;
    public final int requiredTrophies;
    public final String warFrequency;
    public final int warWinStreak;
    public final int warWins;
    public final int warTies;
    public final int warLosses;
    public final boolean isWarLogPublic;
    public final String description;
    public final ClanMember[] memberList;

    public Clan(String tag, String name, Location location, UrlContainer badgeUrls,
                int clanLevel, int clanPoints, int members, String type, int requiredTrophies,
                String warFrequency, int warWinStreak, int warWins, int warTies, int warLosses,
                boolean isWarLogPublic, String description, ClanMember[] memberList) {
        this.tag = tag;
        this.name = name;
        this.location = location;
        this.badgeUrls = badgeUrls;
        this.clanLevel = clanLevel;
        this.clanPoints = clanPoints;
        this.members = members;
        this.type = type;
        this.requiredTrophies = requiredTrophies;
        this.warFrequency = warFrequency;
        this.warWinStreak = warWinStreak;
        this.warWins = warWins;
        this.warTies = warTies;
        this.warLosses = warLosses;
        this.isWarLogPublic = isWarLogPublic;
        this.description = description;
        this.memberList = memberList;
    }
}
