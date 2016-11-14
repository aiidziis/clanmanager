package aiidziis.clanmanager.model;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains with all image resource URLs.
 */
public class UrlContainer {
    public final String small;
    public final String large;
    public final String medium;

    public UrlContainer(String small, String large, String medium) {
        this.small = small;
        this.large = large;
        this.medium = medium;
    }
}
