package aiidziis.clanmanager.model;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains location data.
 */
public class Location {
    public final int id;
    public final String name;
    public final boolean isCountry;

    public Location(int id, String name, boolean isCountry) {
        this.id = id;
        this.name = name;
        this.isCountry = isCountry;
    }
}
