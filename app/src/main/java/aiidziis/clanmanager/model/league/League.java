package aiidziis.clanmanager.model.league;

import aiidziis.clanmanager.model.UrlContainer;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object contains information about league.
 */
public class League {
    public final int id;
    public final String name;
    public final UrlContainer iconUrls;

    public League(int id, String name, UrlContainer iconUrls) {
        this.id = id;
        this.name = name;
        this.iconUrls = iconUrls;
    }
}
