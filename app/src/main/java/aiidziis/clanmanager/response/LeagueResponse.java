package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.league.League;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class LeagueResponse {
    public final League[] items;

    public LeagueResponse(League[] items) {
        this.items = items;
    }
}
