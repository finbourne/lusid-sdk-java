package com.finbourne.lusid.utilities.auth;

import com.finbourne.lusid.utilities.*;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;

public class HttpLusidTokenProviderTests {

    private HttpLusidTokenProvider httpLusidTokenProvider;

    @Before
    public void setUp() throws ApiConfigurationException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        OkHttpClient httpClient = new HttpClientFactory().build(apiConfiguration);
        httpLusidTokenProvider = new HttpLusidTokenProvider(apiConfiguration, httpClient);
    }

    @Test
    public void get_OnRequestingAnInitialToken_ShouldReturnNewToken() throws LusidTokenException {
        LusidToken lusidToken = httpLusidTokenProvider.get(Optional.empty());

        assertThat(lusidToken.getAccessToken(), not(isEmptyOrNullString()));
        assertThat(lusidToken.getRefreshToken(), not(isEmptyOrNullString()));
        assertThat(lusidToken.getExpiresAt(), not(nullValue()));
    }

    @Test
    public void get_OnRequestingANewTokenWithRefreshing_ShouldReturnNewRefreshedToken() throws LusidTokenException {
        LusidToken initialToken = httpLusidTokenProvider.get(Optional.empty());
        // request a new access token based on the refresh parameter of our original token
        LusidToken refreshedToken = httpLusidTokenProvider.get(Optional.of(initialToken.getRefreshToken()));

        assertThat(refreshedToken.getAccessToken(), not(isEmptyOrNullString()));
        assertThat(refreshedToken.getRefreshToken(), not(isEmptyOrNullString()));
        assertThat(refreshedToken.getExpiresAt(), not(nullValue()));
        // ensure our new token is in fact a new and different token
        assertThat(refreshedToken, not(equalTo(initialToken)));
    }

    @Test
    public void get_OnRequestingANewTokenWithoutRefreshing_ShouldReturnNewToken() throws LusidTokenException {
        LusidToken initialToken = httpLusidTokenProvider.get(Optional.empty());
        // request a new access token by going through a full reauthentication (i.e. not a refresh)
        LusidToken aNewToken = httpLusidTokenProvider.get(Optional.empty());

        assertThat(aNewToken.getAccessToken(), not(isEmptyOrNullString()));
        assertThat(aNewToken.getRefreshToken(), not(isEmptyOrNullString()));
        assertThat(aNewToken.getExpiresAt(), not(nullValue()));
        // ensure our new token is in fact a new and different token
        assertThat(aNewToken, not(equalTo(initialToken)));
    }

    // Error cases
    @Test(expected = IllegalArgumentException.class)
    public void get_OnBadTokenUrl_ShouldThrowException() throws LusidTokenException, ApiConfigurationException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        OkHttpClient httpClient = new HttpClientFactory().build(apiConfiguration);
        apiConfiguration.setTokenUrl("invalidTokenUrl");

        HttpLusidTokenProvider httpLusidTokenProvider = new HttpLusidTokenProvider(apiConfiguration, httpClient);
        httpLusidTokenProvider.get(Optional.empty());
    }
}
