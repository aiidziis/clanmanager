package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.clan.ClanRanking;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Response that contains list of clan rankings.
 */
public class ClanRankingResponse {
    public final ClanRanking[] items;

    public ClanRankingResponse(ClanRanking[] items) {
        this.items = items;
    }
}
