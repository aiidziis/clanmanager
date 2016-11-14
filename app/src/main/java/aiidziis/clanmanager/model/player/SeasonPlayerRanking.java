package aiidziis.clanmanager.model.player;

import aiidziis.clanmanager.model.league.League;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains with data about players particular seasons ranking.
 */
public class SeasonPlayerRanking {
    public final String tag;
    public final String name;
    public final int expLevel;
    public final League league;
    public final int trophies;
    public final int attackWins;
    public final int defenseWins;
    public final PlayerClan clan;
    public final int rank;

    public SeasonPlayerRanking(String tag, String name, int expLevel, League league, int trophies,
                               int attackWins, int defenseWins, PlayerClan clan, int rank) {
        this.tag = tag;
        this.name = name;
        this.expLevel = expLevel;
        this.league = league;
        this.trophies = trophies;
        this.attackWins = attackWins;
        this.defenseWins = defenseWins;
        this.clan = clan;
        this.rank = rank;
    }
}
