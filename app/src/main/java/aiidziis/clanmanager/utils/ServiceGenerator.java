package aiidziis.clanmanager.utils;

import java.io.IOException;

import aiidziis.clanmanager.model.Constants;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aigars.cibulskis on 9/1/2016.
 * Class used to make services.
 */
public class ServiceGenerator {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request().newBuilder().addHeader("Accept", "application/json")
                            .addHeader("authorization", "Bearer <" + Constants.API_TOKEN + ">")
                            .build();
                    return chain.proceed(request);
                }
            });

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

    static Retrofit retrofit() {
        OkHttpClient client = httpClient.build();
        return builder.client(client).build();
    }
}
