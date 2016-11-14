package aiidziis.clanmanager.api;

import aiidziis.clanmanager.model.league.League;
import aiidziis.clanmanager.response.LeagueResponse;
import aiidziis.clanmanager.response.LeagueSeasonResponse;
import aiidziis.clanmanager.response.SeasonPlayerRankingResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * API calls used to get all information about leagues.
 */

public interface LeagueService {
    @GET("v1/leagues")
    Observable<LeagueResponse> leagueList();

    @GET("v1/leagues/{leagueId}")
    Observable<League> league(@Path("leagueId") String leagueId);

    @GET("v1/leagues/{leagueId}/seasons")
    Observable<LeagueSeasonResponse> leagueSeasonList(@Path("leagueId") String leagueId);

    @GET("v1/leagues/{leagueId}/seasons/{seasonId}")
    Observable<SeasonPlayerRankingResponse> seasonPlayerRankingList(@Path("leagueId") String leagueId,
                                                                    @Path("seasonId") String seasonId);
}

