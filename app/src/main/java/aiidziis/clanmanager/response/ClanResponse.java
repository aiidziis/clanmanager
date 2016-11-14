package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.clan.Clan;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class ClanResponse {
    public final Clan[] items;

    public ClanResponse(Clan[] items) {
        this.items = items;
    }
}
