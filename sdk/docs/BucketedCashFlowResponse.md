# com.finbourne.lusid.model.BucketedCashFlowResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**data** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | List of dictionary bucketed cash flow result set.  Each dictionary represent a bucketed cashflow result set keyed by AddressKeys.  e.g. dictionary[\&quot;Valuation/CashFlowAmount\&quot;] for the aggregated cash flow amount for the bucket.  e.g. suppose \&quot;RoundUp\&quot; method, then dictionary[\&quot;Valuation/CashFlowDate/RoundUp\&quot;] returns the bucketed cashflow date. | [optional] [default to List<Map<String, Object>>]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCcy denominated queries.  If not present then the currency of the relevant portfolio will be used in its place where relevant. | [optional] [default to String]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Information about where instruments have failed to return cashflows in so far as it is available.  e.g., failure to retrieve a market quote for a floating rate instrument. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketedCashFlowResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Map<String, Object>> Data = new List<Map<String, Object>>();
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
ResultDataSchema DataSchema = new ResultDataSchema();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketedCashFlowResponse bucketedCashFlowResponseInstance = new BucketedCashFlowResponse()
    .Href(Href)
    .Data(Data)
    .ReportCurrency(ReportCurrency)
    .DataSchema(DataSchema)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
