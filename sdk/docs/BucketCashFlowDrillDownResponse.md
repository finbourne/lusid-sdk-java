# com.finbourne.lusid.model.BucketCashFlowDrillDownResponse
The cash flows of a range of effective dates, split into periods by a BucketingSchedule: for each period, member portfolio,  payment currency and sub-holding key combination, its opening balance, the cash flows that make up its activity, and its  closing balance. Each balance and each cash flow appears once, in its bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportCurrency** | **String** | The report currency the cash flows&#39; converted fields are in; absent when none was requested. | [optional] [default to String]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The window start the buckets&#39; balances run from: where the first bucket&#39;s opening balance is taken. | [default to OffsetDateTime]
**buckets** | [**List&lt;BucketCashFlowBucket&gt;**](BucketCashFlowBucket.md) | One bucket per period of the schedule, per member portfolio, payment currency and sub-holding key combination, each with its  opening balance, activity and closing balance. | [default to List<BucketCashFlowBucket>]
**currencySubtotals** | [**List&lt;BucketCurrencySubtotal&gt;**](BucketCurrencySubtotal.md) | The buckets summed across portfolios and sub-holding keys, one per period and payment currency. | [default to List<BucketCurrencySubtotal>]
**issues** | **List&lt;String&gt;** | What the balances do not cover, for example that they are in the payment currency only and gross of haircut; absent when there is nothing to report. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCashFlowDrillDownResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
OffsetDateTime WindowStart = OffsetDateTime.now();
List<BucketCashFlowBucket> Buckets = new List<BucketCashFlowBucket>();
List<BucketCurrencySubtotal> CurrencySubtotals = new List<BucketCurrencySubtotal>();
@jakarta.annotation.Nullable List<String> Issues = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCashFlowDrillDownResponse bucketCashFlowDrillDownResponseInstance = new BucketCashFlowDrillDownResponse()
    .ReportCurrency(ReportCurrency)
    .WindowStart(WindowStart)
    .Buckets(Buckets)
    .CurrencySubtotals(CurrencySubtotals)
    .Issues(Issues)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
