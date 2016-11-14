package aiidziis.clanmanager.model;

/**
 * Created by aigars.cibulskis on 8/31/2016.
 * Object used to get error information.
 */
public class Error {
    public final String reason;
    public final String message;

    public Error(String reason, String message) {
        this.reason = reason;
        this.message = message;
    }
}
