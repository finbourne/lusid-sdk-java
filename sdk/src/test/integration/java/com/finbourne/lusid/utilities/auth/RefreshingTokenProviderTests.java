package com.finbourne.lusid.utilities.auth;

import com.finbourne.lusid.utilities.*;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.mockito.Mockito.*;

public class RefreshingTokenProviderTests {

    private RefreshingTokenProvider tokenProvider;
    private HttpLusidTokenProvider httpLusidTokenProvider;

    @Before
    public void setUp() throws ApiConfigurationException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        OkHttpClient httpClient = new HttpClientFactory().build(apiConfiguration);
        httpLusidTokenProvider = new HttpLusidTokenProvider(apiConfiguration, httpClient);
        RefreshingTokenProvider instanceToSpy = new RefreshingTokenProvider(httpLusidTokenProvider);
        tokenProvider = spy(instanceToSpy);
    }

    @Test
    public void get_OnNoCurrentToken_ShouldReturnNewToken() throws LusidTokenException {
        LusidToken lusidToken = tokenProvider.get();
        assertThat(lusidToken.getAccessToken(), not(isEmptyOrNullString()));
        assertThat(lusidToken.getRefreshToken(), not(isEmptyOrNullString()));
        assertThat(lusidToken.getExpiresAt(), not(nullValue()));
    }

    @Test
    public void get_OnNonExpiredCurrentToken_ShouldReturnSameToken() throws LusidTokenException {
        // first call should create a token
        LusidToken lusidToken = tokenProvider.get();

        // mock token not expired
        doReturn(false).when(tokenProvider).isTokenExpired(lusidToken);

        // second call return same token as it has not expired
        LusidToken nextLusidToken = tokenProvider.get();

        assertThat(nextLusidToken, sameInstance(lusidToken));
    }

    @Test
    public void get_OnExpiredCurrentToken_ShouldReturnNewToken() throws LusidTokenException {
        // first call should create a token
        LusidToken lusidToken = tokenProvider.get();

        // mock token expired
        doReturn(true).when(tokenProvider).isTokenExpired(lusidToken);

        // second call should return a new token as the current one has expired
        LusidToken nextLusidToken = tokenProvider.get();

        assertThat(nextLusidToken.getAccessToken(), not(isEmptyOrNullString()));
        assertThat(nextLusidToken.getRefreshToken(), not(isEmptyOrNullString()));
        assertThat(nextLusidToken.getExpiresAt(), not(nullValue()));

        assertThat(nextLusidToken, not(equalTo(lusidToken)));
        assertThat(nextLusidToken.getAccessToken(), not(equalTo(lusidToken.getAccessToken())));
        assertThat(nextLusidToken.getExpiresAt(), not(equalTo(lusidToken.getExpiresAt())));
        // although a new token the refresh token parameter should remain constant
        assertThat(nextLusidToken.getRefreshToken(), equalTo(lusidToken.getRefreshToken()));
    }

    @Test
    public void get_OnFailedRefreshToken_ShouldGetNewToken() throws LusidTokenException {

        httpLusidTokenProvider = mock(HttpLusidTokenProvider.class);

        // synthesise an error getting the refresh token
        IOException ioException = new IOException("bad-connection");
        LusidTokenException tokenException = new LusidTokenException("token-error", ioException);

        // mock retrieving initial token that then expires
        LusidToken expiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MIN);
        LusidToken refreshedToken = new LusidToken("access_02", "refresh_02", LocalDateTime.MAX);
        doReturn(expiredToken, refreshedToken).when(httpLusidTokenProvider).get(Optional.empty());

        // exception when attempting to get the refresh token
        doThrow(tokenException).when(httpLusidTokenProvider).get(Optional.of(expiredToken.getRefreshToken()));

        RefreshingTokenProvider instanceToSpy = new RefreshingTokenProvider(httpLusidTokenProvider);
        tokenProvider = spy(instanceToSpy);

        // get the initial token
        LusidToken lusidToken = tokenProvider.get();

        // attempt to get the refresh token
        LusidToken nextToken = tokenProvider.get();

        // failed refresh attempt results in getting a new token
        assertThat(nextToken, equalTo(refreshedToken));
    }


}
