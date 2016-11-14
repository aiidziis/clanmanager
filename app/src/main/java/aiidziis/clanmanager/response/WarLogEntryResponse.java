package aiidziis.clanmanager.response;

import java.util.Arrays;

import aiidziis.clanmanager.model.war.WarLogEntry;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 */
public class WarLogEntryResponse {
    public final WarLogEntry[] items;

    public WarLogEntryResponse(WarLogEntry[] items) {
        this.items = items;
    }
}
