package aiidziis.clanmanager.api;

import aiidziis.clanmanager.model.clan.Clan;
import aiidziis.clanmanager.response.ClanMemberResponse;
import aiidziis.clanmanager.response.ClanResponse;
import aiidziis.clanmanager.response.WarLogEntryResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * API used to get all information about clan.
 */
public interface ClansService {
    @GET("v1/clans")
    Observable<ClanResponse> clanList();

    @GET("v1/clans/{clanTag}")
    Observable<Clan> clan(@Path("clanTag") String clanTag);

    @GET("v1/clans/{clanTag}/members")
    Observable<ClanMemberResponse> clanMemberList(@Path("clanTag") String clanTag);

    @GET("v1/clans/{clanTag}/warlog")
    Observable<WarLogEntryResponse> warLogEntryList(@Path("clanTag") String clanTag);
}

