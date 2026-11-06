# com.finbourne.lusid.model.BucketCashFlowDrillDownResponse
The cash flows inside one bucket, with the bucket's balances as the ladder of QueryBucketedCashFlows has them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;CashFlowDetail&gt;**](CashFlowDetail.md) |  | [default to List<CashFlowDetail>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**reportCurrency** | **String** | The report currency the converted fields are in; absent when none was requested. | [optional] [default to String]
**balances** | [**List&lt;BucketCashFlowBalance&gt;**](BucketCashFlowBalance.md) | The bucket&#39;s opening balance, activity and closing balance per payment currency, in the payment currency, in the report  currency when one was requested, and net of haircut when haircut rules were supplied. Absent when no WindowStart was supplied, and when a BucketingSchedule was  supplied: the Buckets and CurrencySubtotals carry the balances then. | [optional] [default to List<BucketCashFlowBalance>]
**nextPage** | **String** | The next page of results: never present, as the cash flows of a bucket are not paged; kept so this response is a superset of the list it replaces. | [optional] [default to String]
**previousPage** | **String** | The previous page of results: never present; see NextPage. | [optional] [default to String]
**issues** | **List&lt;String&gt;** | Why balances, or report currency figures, are absent when they were asked for; absent when there is nothing to report. | [optional] [default to List<String>]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The window start the buckets&#39; balances run from. Present with BucketingSchedule. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The valuation date the cash flows were evaluated at. Present with BucketingSchedule. | [optional] [default to OffsetDateTime]
**startInclusive** | **Boolean** | Whether a cash flow paid exactly on a bucket&#39;s start is in it. Present with BucketingSchedule. | [optional] [default to Boolean]
**endInclusive** | **Boolean** | Whether a cash flow paid exactly on a bucket&#39;s end is in it. Present with BucketingSchedule. | [optional] [default to Boolean]
**buckets** | [**List&lt;BucketCashFlowBucket&gt;**](BucketCashFlowBucket.md) | One bucket per period of the schedule, per member portfolio, payment currency and sub-holding key combination, each with its  opening balance, closing balance and activity. Present only when a BucketingSchedule was supplied. | [optional] [default to List<BucketCashFlowBucket>]
**currencySubtotals** | [**List&lt;BucketCurrencySubtotal&gt;**](BucketCurrencySubtotal.md) | The buckets summed across portfolios and sub-holding keys, one per period and payment currency. Present only with Buckets. | [optional] [default to List<BucketCurrencySubtotal>]
**subtotal** | [**BucketCashFlowSubtotal**](BucketCashFlowSubtotal.md) |  | [optional] [default to BucketCashFlowSubtotal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCashFlowDrillDownResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<CashFlowDetail> Values = new List<CashFlowDetail>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
@jakarta.annotation.Nullable List<BucketCashFlowBalance> Balances = new List<BucketCashFlowBalance>();
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<String> Issues = new List<String>();
@jakarta.annotation.Nullable OffsetDateTime WindowStart = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Boolean StartInclusive = true;
@jakarta.annotation.Nullable Boolean EndInclusive = true;
@jakarta.annotation.Nullable List<BucketCashFlowBucket> Buckets = new List<BucketCashFlowBucket>();
@jakarta.annotation.Nullable List<BucketCurrencySubtotal> CurrencySubtotals = new List<BucketCurrencySubtotal>();
BucketCashFlowSubtotal Subtotal = new BucketCashFlowSubtotal();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCashFlowDrillDownResponse bucketCashFlowDrillDownResponseInstance = new BucketCashFlowDrillDownResponse()
    .Values(Values)
    .Href(Href)
    .ReportCurrency(ReportCurrency)
    .Balances(Balances)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Issues(Issues)
    .WindowStart(WindowStart)
    .EffectiveAt(EffectiveAt)
    .StartInclusive(StartInclusive)
    .EndInclusive(EndInclusive)
    .Buckets(Buckets)
    .CurrencySubtotals(CurrencySubtotals)
    .Subtotal(Subtotal)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
