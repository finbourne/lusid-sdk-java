package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.utilities.auth.LusidToken;
import com.finbourne.lusid.utilities.auth.LusidTokenException;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.*;

public class ApiClientBuilderTest {

    private ApiClientBuilder apiClientBuilder;

    // mock dependencies
    private ApiClient apiClient;
    private OkHttpClient httpClient;
    private ApiConfiguration apiConfiguration;
    private LusidToken lusidToken;

    // test helpers
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        httpClient = mock(OkHttpClient.class);
        apiConfiguration = mock(ApiConfiguration.class);
        lusidToken = mock(LusidToken.class);
        apiClient = mock(ApiClient.class);
        apiClientBuilder = spy(new ApiClientBuilder());

        // mock creation of default api client
        doReturn(apiClient).when(apiClientBuilder).createApiClient(any(Integer.class));
        // mock default well formed lusid token
        doReturn("access_token_01").when(lusidToken).getAccessToken();
    }

    @Test
    public void createApiClient_OnProxyAddress_ShouldSetHttpClient() throws LusidTokenException {
        doReturn("http://proxy.address").when(apiConfiguration).getProxyAddress();
        apiClientBuilder.createDefaultApiClient(apiConfiguration, httpClient, lusidToken);
        verify(apiClient).setHttpClient(httpClient);
    }

    @Test
    public void createApiClient_OnNoApplicationName_ShouldNotSetApplicationHeader() throws LusidTokenException {
        doReturn(null).when(apiConfiguration).getApplicationName();
        apiClientBuilder.createDefaultApiClient(apiConfiguration, httpClient, lusidToken);
        verify(apiClient, times(0)).addDefaultHeader(eq("X-LUSID-Application"), any());
    }

    @Test
    public void createApiClient_OnNullAccessToken_ShouldThrowLusidTokenException() throws LusidTokenException {
        doReturn(null).when(lusidToken).getAccessToken();
        thrown.expect(LusidTokenException.class);
        thrown.expectMessage("Cannot construct an API client with a null authorisation header. Ensure " +
                "lusid token generated is valid");
        apiClientBuilder.createDefaultApiClient(apiConfiguration, httpClient, lusidToken);
    }
}
