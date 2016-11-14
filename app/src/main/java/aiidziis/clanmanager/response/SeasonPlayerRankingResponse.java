package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.player.SeasonPlayerRanking;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class SeasonPlayerRankingResponse {
    public final SeasonPlayerRanking[] items;

    public SeasonPlayerRankingResponse(SeasonPlayerRanking[] items) {
        this.items = items;
    }
}
