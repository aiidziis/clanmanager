package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.clan.ClanMember;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class ClanMemberResponse {
    public final ClanMember[] items;

    public ClanMemberResponse(ClanMember[] items) {
        this.items = items;
    }
}
