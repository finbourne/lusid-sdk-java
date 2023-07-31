package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.api.ScopesApi;
import com.finbourne.lusid.auth.OAuth;
import com.finbourne.lusid.model.ResourceListOfScopeDefinition;
import com.finbourne.lusid.utilities.auth.LusidTokenException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.Duration;
import java.time.Instant;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class ApiClientBuilderTests {

    private ApiClientBuilder apiClientBuilder;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        apiClientBuilder = new ApiClientBuilder();
    }

    @Test
    public void build_OnValidConfigurationFile_ShouldBuildKeepLiveApiClient()
            throws ApiConfigurationException, LusidTokenException {
        // This test assumes default secrets file is valid without a PAT. Same assertion
        // as all other integration tests.
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);
        // running with no exceptions ensures client built correctly with no
        // configuration or token creation exceptions
        assertThat("Unexpected extended implementation of ApiClient for default build.",
                apiClient, instanceOf(RefreshingTokenApiClient.class));
    }

    @Test
    public void build_WithValidPAT_ShouldBuildKeepLiveApiClient()
            throws ApiConfigurationException, LusidTokenException {

        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build("secrets-pat.json");
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);

        OAuth auth = (OAuth) apiClient.getAuthentication("oauth2");

        assertThat(auth.getAccessToken(), equalTo(apiConfiguration.getPersonalAccessToken()));
    }

    @Test
    public void build_BadTokenConfigurationFile_ShouldThrowException() throws LusidTokenException {
        thrown.expect(LusidTokenException.class);
        ApiConfiguration apiConfiguration = getBadTokenConfiguration();
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);
    }

    private ApiConfiguration getBadTokenConfiguration() {
        return new ApiConfiguration(
                "https://some-non-existing-test-instance.doesnotexist.com/oauth2/doesnotexist/v1/token",
                "test.testing@finbourne.com",
                "note",
                "invalid-client-id",
                "none",
                "https://some-non-existing-test-instance.lusid.com/api",
                "non-existent",
                // proxy strs
                "", 8888, "", "");
    }

    @Test
    public void call_Api_With_Timeout() throws Exception {

        int timeoutInSeconds = 20;
        int defaultTimeout = 10;
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration, timeoutInSeconds, timeoutInSeconds,
                timeoutInSeconds, 3);

        ScopesApi scopesApi = new ScopesApi(apiClient);
        Instant start = Instant.now();

        try {
            start = Instant.now();
            ResourceListOfScopeDefinition scopes = scopesApi.listScopes(null);

            // successful call within timeout
        } catch (Exception ex) {
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis() / 1000;

            assertThat(elapsed, greaterThanOrEqualTo((long) defaultTimeout));
        }
    }

}
