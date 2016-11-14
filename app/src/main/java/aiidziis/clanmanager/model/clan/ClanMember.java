package aiidziis.clanmanager.model.clan;

import aiidziis.clanmanager.model.league.League;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains information about clan member.
 */
public class ClanMember {
    public final String tag;
    public final String name;
    public final int expLevel;
    public final League league;
    public final int trophies;
    public final String role;
    public final int clanRank;
    public final int previousClanRank;
    public final int donations;
    public final int donationsReceived;

    public ClanMember(String tag, String name, int expLevel, League league, int trophies, String role, int clanRank, int previousClanRank, int donations, int donationsReceived) {
        this.tag = tag;
        this.name = name;
        this.expLevel = expLevel;
        this.league = league;
        this.trophies = trophies;
        this.role = role;
        this.clanRank = clanRank;
        this.previousClanRank = previousClanRank;
        this.donations = donations;
        this.donationsReceived = donationsReceived;
    }
}
