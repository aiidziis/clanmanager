package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.Location;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains list of Locations.
 */
public class LocationsResponse {
    public final Location[] items;

    public LocationsResponse(Location[] items) {
        this.items = items;
    }
}
