package aiidziis.clanmanager.model.war;

import aiidziis.clanmanager.model.UrlContainer;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object that contains information about war clan.
 */
public class WarClan {
    public final String tag;
    public final String name;
    public final UrlContainer badgeUrls;
    public final int clanLevel;
    public final int attacks;
    public final int stars;
    public final int expEarned;

    public WarClan(String tag, String name, UrlContainer badgeUrls, int clanLevel, int attacks,
                   int stars, int expEarned) {

        this.tag = tag;
        this.name = name;
        this.badgeUrls = badgeUrls;
        this.clanLevel = clanLevel;
        this.attacks = attacks;
        this.stars = stars;
        this.expEarned = expEarned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WarClan)) return false;

        WarClan warClan = (WarClan) o;

        if (clanLevel != warClan.clanLevel) return false;
        if (attacks != warClan.attacks) return false;
        if (stars != warClan.stars) return false;
        if (expEarned != warClan.expEarned) return false;
        if (!tag.equals(warClan.tag)) return false;
        if (!name.equals(warClan.name)) return false;
        return badgeUrls.equals(warClan.badgeUrls);

    }

    @Override
    public int hashCode() {
        int result = tag.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + badgeUrls.hashCode();
        result = 31 * result + clanLevel;
        result = 31 * result + attacks;
        result = 31 * result + stars;
        result = 31 * result + expEarned;
        return result;
    }

    @Override
    public String toString() {
        return "WarClan{" +
                "tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", badgeUrls=" + badgeUrls +
                ", clanLevel=" + clanLevel +
                ", attacks=" + attacks +
                ", stars=" + stars +
                ", expEarned=" + expEarned +
                '}';
    }
}
