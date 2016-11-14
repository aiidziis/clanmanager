package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.league.LeagueSeason;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class LeagueSeasonResponse {
    public final LeagueSeason[] items;

    public LeagueSeasonResponse(LeagueSeason[] items) {
        this.items = items;
    }
}
