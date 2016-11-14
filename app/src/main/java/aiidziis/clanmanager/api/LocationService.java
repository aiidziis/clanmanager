package aiidziis.clanmanager.api;

import aiidziis.clanmanager.model.Location;
import aiidziis.clanmanager.response.ClanRankingResponse;
import aiidziis.clanmanager.response.LocationsResponse;
import aiidziis.clanmanager.response.PlayerRankingResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * API calls to get all information about locations.
 */
public interface LocationService {
    @GET("v1/locations")
    Observable<LocationsResponse> locationList();

    @GET("v1/locations/{locationId}")
    Observable<Location> location(@Path("locationId") String locationId);

    @GET("v1/locations/{locationId}/rankings/clans")
    Observable<ClanRankingResponse> clanRankingList(@Path("locationId") String locationId);

    @GET("v1/locations/{locationId}/rankings/players")
    Observable<PlayerRankingResponse> playerRankingList(@Path("locationId") String locationId);
}

