package aiidziis.clanmanager.utils;

import java.io.IOException;
import java.lang.annotation.Annotation;

import aiidziis.clanmanager.model.Error;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

/**
 * Created by aigars.cibulskis on 9/1/2016.
 * Class used for error handling.
 */
public class ErrorUtils {

    public static Error parseError(Response<?> response) {

        Converter<ResponseBody, Error> converter =
                ServiceGenerator.retrofit()
                        .responseBodyConverter(Error.class, new Annotation[0]);

        Error error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new Error("a", "b");
        }

        return error;
    }
}
