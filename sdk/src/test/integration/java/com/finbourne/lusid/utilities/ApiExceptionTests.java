package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.utilities.auth.LusidTokenException;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ApiExceptionTests {

    @Test
    public void thrown_exception_tostring_contains_requestid() throws ApiConfigurationException, LusidTokenException {

        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);

        PortfoliosApi portfoliosApi = new PortfoliosApi(apiClient);

        try {
            portfoliosApi.getPortfolio("doesnt", "exist", null, null, null, null);
        }
        catch (ApiException e) {

            String message = e.toString();

            assertNotNull("Null exception message", message);

            String[] parts = message.split("\\r?\\n");

            assertThat(parts.length, is(greaterThanOrEqualTo(1)));

            //  of the format 'LUSID request id = 000000000:AAAAAAA'
            String[] idParts = parts[0].split(" = ");

            assertThat("missing requestId", idParts.length, is(equalTo(2)));
        }
        catch (Exception e) {
            fail("Unexpected exception of type " + e.getClass());
        }


    }
}
