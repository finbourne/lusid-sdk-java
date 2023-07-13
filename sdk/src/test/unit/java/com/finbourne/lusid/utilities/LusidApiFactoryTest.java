package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.Portfolio;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class LusidApiFactoryTest {

    private LusidApiFactory apiFactory;
    private ApiClient apiClient;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        apiClient = mock(ApiClient.class);
        apiFactory = new LusidApiFactory(apiClient);
    }

    // General Cases

    @Test
    public void build_ForPortfolioApi_ReturnPortfolioApi(){
        PortfoliosApi portfoliosApi = apiFactory.build(PortfoliosApi.class);
        assertThat(portfoliosApi, instanceOf(PortfoliosApi.class));
    }

    @Test
    public void build_ForTransactionPortfolioApi_ReturnTransactionPortfolioApi(){
        TransactionPortfoliosApi portfoliosApi = apiFactory.build(TransactionPortfoliosApi.class);
        assertThat(portfoliosApi, instanceOf(TransactionPortfoliosApi.class));
    }

    @Test
    public void build_ForAggregationApi_ReturnAggregationApi(){
        AggregationApi portfoliosApi = apiFactory.build(AggregationApi.class);
        assertThat(portfoliosApi, instanceOf(AggregationApi.class));
    }

    @Test
    public void build_ForAnyApi_SetsTheApiFactoryClientAndNotTheDefault(){
        PortfoliosApi portfoliosApi = apiFactory.build(PortfoliosApi.class);
        assertThat(portfoliosApi.getApiClient(), equalTo(apiClient));
    }

    // Singleton Check Cases

    @Test
    public void build_ForSameApiBuiltAgainWithSameFactory_ReturnTheSameSingletonInstanceOfApi(){
        PortfoliosApi portfoliosApi = apiFactory.build(PortfoliosApi.class);
        PortfoliosApi portfoliosApiSecond = apiFactory.build(PortfoliosApi.class);
        assertThat(portfoliosApi, sameInstance(portfoliosApiSecond));
    }

    @Test
    public void build_ForSameApiBuiltWithDifferentFactories_ReturnAUniqueInstanceOfApi(){
        PortfoliosApi portfoliosApi = apiFactory.build(PortfoliosApi.class);
        PortfoliosApi portfoliosApiSecond = new LusidApiFactory(mock(ApiClient.class)).build(PortfoliosApi.class);
        assertThat(portfoliosApi, not(sameInstance(portfoliosApiSecond)));
    }

    // Error Cases

    @Test
    public void build_ForNonApiPackageClass_ShouldThrowException(){
        thrown.expect(UnsupportedOperationException.class);
        thrown.expectMessage("Portfolio class is not a supported API class. " +
                "Supported API classes live in the " + LusidApiFactory.LUSID_API_PACKAGE + " package.");
        apiFactory.build(Portfolio.class);
    }



}
