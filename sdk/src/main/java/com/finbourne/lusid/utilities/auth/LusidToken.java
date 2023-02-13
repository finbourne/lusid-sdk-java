package com.finbourne.lusid.utilities.auth;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Container for token information required to authenticate against LUSID.
 *
 */
public class LusidToken {

    /** Token used against API calls for authentication */
    private final String accessToken;

    /** Token used to refresh existing access token on expiry */
    private final String refreshToken;

    /** Expiry time of the current access token */
    private final LocalDateTime expiresAt;

    public LusidToken(String accessToken, String refreshToken, LocalDateTime expiresAt) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresAt = expiresAt;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LusidToken that = (LusidToken) o;
        return Objects.equals(accessToken, that.accessToken) &&
                Objects.equals(refreshToken, that.refreshToken) &&
                Objects.equals(expiresAt, that.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, refreshToken, expiresAt);
    }
}
