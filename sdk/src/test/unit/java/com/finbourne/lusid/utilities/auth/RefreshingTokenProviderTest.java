package com.finbourne.lusid.utilities.auth;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class RefreshingTokenProviderTest {

    private RefreshingTokenProvider tokenProvider;

    // dependency mocks
    private HttpLusidTokenProvider httpLusidTokenProvider;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        httpLusidTokenProvider = mock(HttpLusidTokenProvider.class);
        tokenProvider = new RefreshingTokenProvider(httpLusidTokenProvider);
    }

    @Test
    public void get_OnNoCurrentToken_ShouldCallLusidProviderForFullAuthentication() throws LusidTokenException {
        // mock retrieving initial token when calling lusid API
        LusidToken authenticatedToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MAX);
        doReturn(authenticatedToken).when(httpLusidTokenProvider).get(Optional.empty());

        LusidToken currentToken = tokenProvider.get();

        assertThat(currentToken, equalTo(authenticatedToken));
        // ensure retrieved token using api call and did so via full authentication route
        verify(httpLusidTokenProvider, times(1)).get(Optional.empty());
    }

    @Test
    public void get_OnNonExpiredCurrentToken_ShouldDoNothing() throws LusidTokenException {
        LusidToken nonExpiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MAX);
        doReturn(nonExpiredToken).when(httpLusidTokenProvider).get(Optional.empty());

        // first call should create a token (not expired)
        LusidToken currentToken = tokenProvider.get();

        // second call return same token as it has not expired
        LusidToken nextToken = tokenProvider.get();

        assertThat(nextToken, sameInstance(currentToken));
        // ensure only ever made one remote call via full authentication
        verify(httpLusidTokenProvider, times(1)).get(Optional.empty());
        verify(httpLusidTokenProvider, times(0)).get(Optional.of(anyString()));
    }

    @Test
    public void get_OnExpiredCurrentToken_ShouldCallLusidForNewRefreshedToken() throws LusidTokenException {
        // mock retrieving initial token that then expires
        LusidToken expiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MIN);
        doReturn(expiredToken).when(httpLusidTokenProvider).get(Optional.empty());

        // mock retrieving a refreshed token when we attempt to call api with a valid refresh parameter
        LusidToken refreshedToken = new LusidToken("access_02", "refresh_01", LocalDateTime.MAX);
        doReturn(refreshedToken).when(httpLusidTokenProvider).get(Optional.of("refresh_01"));

        // first call should create a token (expired)
        LusidToken currentToken = tokenProvider.get();

        // second call should return a new token as the current one has expired
        LusidToken nextToken = tokenProvider.get();

        assertThat(nextToken, not(equalTo(currentToken)));
        assertThat(nextToken, equalTo(refreshedToken));
        // ensure make one call for full authentication and subsequent call via refresh
        verify(httpLusidTokenProvider, times(1)).get(Optional.empty());
        verify(httpLusidTokenProvider, times(1)).get(Optional.of("refresh_01"));
    }

    @Test
    public void get_OnExpiredRefreshToken_ShouldCallLusidProviderForFullReauthentication() throws LusidTokenException {
        // Test the less often case where the REFRESH token itself has expired and attempting to refresh is not
        // possible. A full authentication is required

        // setup initial expired access token
        LusidToken expiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MIN);
        doReturn(expiredToken).when(httpLusidTokenProvider).get(Optional.empty());
        // first call should create a token (expired)
        LusidToken currentToken = tokenProvider.get();

        // throw exception on attempting to refresh with an expired REFRESH token
        doThrow(new LusidTokenException("Refresh token has expired")).when(httpLusidTokenProvider).get(Optional.of("refresh_01"));
        // setup a new access token via full authentication route
        LusidToken newTokenWithNewRefresh = new LusidToken("access_02", "refresh_02", LocalDateTime.MAX);
        doReturn(newTokenWithNewRefresh).when(httpLusidTokenProvider).get(Optional.empty());

        // fetch token again. as both the access and refresh token have expired expect an exception and a full
        // reauthentication attempt
        LusidToken nextToken = tokenProvider.get();

        assertThat(nextToken, not(equalTo(currentToken)));
        assertThat(nextToken, equalTo(newTokenWithNewRefresh));
        // ensure make initial full auth call, a refresh attempt and another full auth call
        verify(httpLusidTokenProvider, times(2)).get(Optional.empty());
        verify(httpLusidTokenProvider, times(1)).get(Optional.of("refresh_01"));
    }

    // Error Cases

    @Test
    public void get_OnFailedRemoteAuthentication_ShouldReThrowLusidTokenException() throws LusidTokenException {
        LusidTokenException lusidTokenException = new LusidTokenException("Failed to retrieve token");
        doThrow(lusidTokenException).when(httpLusidTokenProvider).get(Optional.empty());

        thrown.expect(LusidTokenException.class);
        tokenProvider.get();
    }

    @Test
    public void get_OnFailedRefreshAndFailedReAuthAttempt_ShouldReThrowLusidTokenException() throws LusidTokenException {
        LusidToken expiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MIN);
        doReturn(expiredToken).when(httpLusidTokenProvider).get(Optional.empty());

        // get the first token (expired)
        LusidToken currentToken = tokenProvider.get();

        // mock the refresh token expiring
        doThrow(new LusidTokenException("Refresh token has expired")).when(httpLusidTokenProvider).get(Optional.of("refresh_01"));
        // mock full authentication failing on a retry
        doThrow(new LusidTokenException("Reauthentication attempt has failed")).when(httpLusidTokenProvider).get(Optional.empty());

        thrown.expect(LusidTokenException.class);
        tokenProvider.get();
    }

    @Test
    public void get_OnFailedRefreshAuthAttempt_ShouldReThrowLusidTokenExceptionWithCause() throws LusidTokenException {
        LusidToken expiredToken = new LusidToken("access_01", "refresh_01", LocalDateTime.MIN);
        doReturn(expiredToken).when(httpLusidTokenProvider).get(Optional.empty());

        // get the first token (expired)
        LusidToken currentToken = tokenProvider.get();

        // mock unable to get the refresh token
        IOException cause = new IOException("Bad connection");
        doThrow(new LusidTokenException("Refresh token has expired", cause)).when(httpLusidTokenProvider).get(Optional.of(currentToken.getRefreshToken()));

        tokenProvider.get();

        //  details are in the log message
    }

}
