package com.finbourne.lusid.utilities.auth;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides {@link LusidToken} used for API authentication and manages
 * token expiry to ensure continued connectivity to LUSID API without the need
 * for explicit reauthentication by the caller.
 *
 */
public class RefreshingTokenProvider {

    private final Logger logger = Logger.getLogger(getClass().getName());

    /** Underlying token provider that authenticates against LUSID*/
    private final HttpLusidTokenProvider httpLusidTokenProvider;

    /** Current token in use for API calls*/
    private LusidToken currentToken;

    /**
     * Creates a KeepAuthTokenProvider based on an underlying token provider
     * that manages direct authentication with LUSID.
     *
     * @param httpLusidTokenProvider underlying provider that manages explicit authentication calls to LUSID
     */
    public RefreshingTokenProvider(HttpLusidTokenProvider httpLusidTokenProvider) {
        this.httpLusidTokenProvider = httpLusidTokenProvider;
    }

    /**
     * Stores an initial {@link LusidToken} on complete authentication (with username and password) and
     * will subsequently manage refreshing the token after expiry.
     *
     * @return a live and valid {@link LusidToken}
     *
     * @throws LusidTokenException on failing to authenticate and retrieve a token
     */
    public synchronized LusidToken get() throws LusidTokenException {
        if (currentToken == null) {
            currentToken = httpLusidTokenProvider.get(Optional.empty());
        } else if (isTokenExpired(currentToken)) {
            try {
                currentToken = httpLusidTokenProvider.get(Optional.of(currentToken.getRefreshToken()));
            } catch (LusidTokenException e){
                Throwable cause = e.getCause();
                logger.log(Level.WARNING, "Authentication call to refresh token has failed. Attempting to reauthenticate" +
                        " fully with credentials. Refresh failure reason: " + e.getMessage() + (cause == null ? "" : ", " +  cause.getMessage()));
                currentToken = httpLusidTokenProvider.get(Optional.empty());
            }
        }
        return currentToken;
    }

    /**
     * Checks if a token has expired
     *
     * @param token to check expiry on
     * @return true if token expired false otherwise
     */
    public boolean isTokenExpired(LusidToken token){
        return LocalDateTime.now().isAfter(token.getExpiresAt());
    }

}
