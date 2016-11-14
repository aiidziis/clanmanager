package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.player.PlayerRanking;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Response that contains list of player rankings.
 */
public class PlayerRankingResponse {
    public final PlayerRanking[] items;

    public PlayerRankingResponse(PlayerRanking[] items) {
        this.items = items;
    }
}
