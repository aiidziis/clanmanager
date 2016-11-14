package aiidziis.clanmanager.model.player;

import aiidziis.clanmanager.model.UrlContainer;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object with data about player clan.
 */
public class PlayerClan {
    public final String tag;
    public final String name;
    public final UrlContainer badgeUrls;

    public PlayerClan(String tag, String name, UrlContainer badgeUrls) {
        this.tag = tag;
        this.name = name;
        this.badgeUrls = badgeUrls;
    }
}
