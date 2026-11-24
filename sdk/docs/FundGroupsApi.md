# FundGroupsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFundGroupTrialBalance**](FundGroupsApi.md#getFundGroupTrialBalance) | **POST** /api/fundgroups/{scope}/{code}/trialbalance/$query | [EARLY ACCESS] GetFundGroupTrialBalance: Get the Trial Balance for a group of Funds. |



## getFundGroupTrialBalance

> FundGroupTrialBalanceResponse getFundGroupTrialBalance(scope, code, fundGroupTrialBalanceRequest, asAt, filter, limit, page, propertyKeys)

[EARLY ACCESS] GetFundGroupTrialBalance: Get the Trial Balance for a group of Funds.

Runs the Trial Balance once for every Fund in a fund group, where the group is a reference list of type  FundIdList or FilteredFundIdList identified by the scope and code. LUSID chooses the Valuation Point for  each Fund and NAV type from the run type, and each returned row carries the Fund, NAV type and Valuation Point  it came from. A Fund that could not be reported, because no Valuation Point matches the run type or the NAV type  is missing, is listed in fundResults alongside the rows. A Fund in a FundIdList that the caller is not entitled  to read is listed there too; a FilteredFundIdList only ever contains the Funds the caller can read.     Rows are ordered by Fund scope, then Fund code, then NAV type code, then as GetValuationPointTrialBalance orders  them, so the order is stable across pages.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundGroupsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // FundGroupsApi apiInstance = apiFactory.build(FundGroupsApi.class);

        FundGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the reference list that defines the fund group.
        String code = "code_example"; // String | The code of the reference list that defines the fund group. Together with the scope this uniquely identifies the reference list.
        FundGroupTrialBalanceRequest fundGroupTrialBalanceRequest = new FundGroupTrialBalanceRequest(); // FundGroupTrialBalanceRequest | The run type, dates, NAV type and Trial Balance options.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Trial Balances and resolve the fund group.   Defaults to returning the latest version if not specified.
        String filter = "filter_example"; // String | Expression to filter the rows by, using the same fields as GetValuationPointTrialBalance.   For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        Integer limit = 56; // Integer | When paginating, limit the number of returned rows to this number.   Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing rows.   This token is returned from the previous call.   If a pagination token is provided, the filter, request body and asAt fields   must not have changed since the original request.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', 'Portfolio', 'Account', 'LegalEntity' or 'CustodianAccount'   domain to decorate onto each row's TrialBalance.
        try {
            // uncomment the below to set overrides at the request level
            // FundGroupTrialBalanceResponse result = apiInstance.getFundGroupTrialBalance(scope, code, fundGroupTrialBalanceRequest, asAt, filter, limit, page, propertyKeys).execute(opts);

            FundGroupTrialBalanceResponse result = apiInstance.getFundGroupTrialBalance(scope, code, fundGroupTrialBalanceRequest, asAt, filter, limit, page, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundGroupsApi#getFundGroupTrialBalance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the reference list that defines the fund group. | |
| **code** | **String**| The code of the reference list that defines the fund group. Together with the scope this uniquely identifies the reference list. | |
| **fundGroupTrialBalanceRequest** | [**FundGroupTrialBalanceRequest**](FundGroupTrialBalanceRequest.md)| The run type, dates, NAV type and Trial Balance options. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Trial Balances and resolve the fund group.   Defaults to returning the latest version if not specified. | [optional] |
| **filter** | **String**| Expression to filter the rows by, using the same fields as GetValuationPointTrialBalance.   For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned rows to this number.   Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing rows.   This token is returned from the previous call.   If a pagination token is provided, the filter, request body and asAt fields   must not have changed since the original request. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39;   domain to decorate onto each row&#39;s TrialBalance. | [optional] |

### Return type

[**FundGroupTrialBalanceResponse**](FundGroupTrialBalanceResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Trial Balance rows of the Funds in the group, with the outcome for each Fund and NAV type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

