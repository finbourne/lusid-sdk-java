package com.finbourne.lusid.utilities.auth;

import com.finbourne.lusid.utilities.ApiConfiguration;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

public class HttpLusidTokenProviderTest {

    private HttpLusidTokenProvider httpLusidTokenProvider;

    @Before
    public void setUp() {
        ApiConfiguration apiConfiguration = mock(ApiConfiguration.class);
        OkHttpClient httpClient = mock(OkHttpClient.class);
        httpLusidTokenProvider = new HttpLusidTokenProvider(apiConfiguration, httpClient);
    }

    @Test
    public void calculateExpiryAtTime_ShouldApplyThirtySecondCut(){
        LocalDateTime authTime = LocalDateTime.of(2020,01,01,00,00,00);
        int expiryIn = 3600;

        LocalDateTime expiryAt = httpLusidTokenProvider.calculateExpiryAtTime(authTime, expiryIn);

        assertThat("Expiry At time should be an hour ahead of the time of auth call minus a 30 second gap for " +
                        "to allow for retrieving for a new token before expiry token.",
                expiryAt,
                equalTo(LocalDateTime.of(2020,01,01,00,59,30)));
    }

}
