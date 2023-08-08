package com.finbourne.lusid.extensions.auth;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Provides {@link FinbourneToken} used for API authentication and manages
* token expiry to ensure continued connectivity to lusid API without the need
* for explicit reauthentication by the caller.
*
*/
public class RefreshingTokenProvider {

    private final Logger logger = Logger.getLogger(getClass().getName());

    /** Underlying token provider that authenticates against OKTA*/
    private final HttpFinbourneTokenProvider httpFinbourneTokenProvider;

    /** Current token in use for API calls*/
    private FinbourneToken currentToken;

    /**
    * Creates a KeepAuthTokenProvider based on an underlying token provider
    * that manages direct authentication with lusid.
    *
    * @param httpFinbourneTokenProvider underlying provider that manages explicit authentication calls to lusid
    */
    public RefreshingTokenProvider(HttpFinbourneTokenProvider httpFinbourneTokenProvider) {
        this.httpFinbourneTokenProvider = httpFinbourneTokenProvider;
    }

    /**
    * Stores an initial {@link FinbourneToken} on complete authentication (with username and password) and
    * will subsequently manage refreshing the token after expiry.
    *
    * @return a live and valid {@link FinbourneToken}
    *
    * @throws FinbourneTokenException on failing to authenticate and retrieve a token
    */
    public synchronized FinbourneToken get() throws FinbourneTokenException {
        if (currentToken == null) {
            currentToken = httpFinbourneTokenProvider.get(Optional.empty());
        } else if (isTokenExpired(currentToken)) {
            try {
                currentToken = httpFinbourneTokenProvider.get(Optional.of(currentToken.getRefreshToken()));
            } catch (FinbourneTokenException e){
                logger.log(Level.WARNING, "Authentication call to refresh token has failed. Attempting to reauthenticate" +
                        " fully with credentials. Refresh failure reason: " + e.getMessage());
                currentToken = httpFinbourneTokenProvider.get(Optional.empty());
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
    public boolean isTokenExpired(FinbourneToken token){
        return LocalDateTime.now().isAfter(token.getExpiresAt());
    }

}
