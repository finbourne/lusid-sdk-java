# com.finbourne.lusid.model.BucketedCashFlowRequest
Specification class consisting of parameters for BucketedCashFlow endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points. Available values: RoundUp, RoundDown. | [default to String]
**bucketingDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty. | [optional] [default to List<OffsetDateTime>]
**bucketTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty. | [optional] [default to List<String>]
**effectiveAt** | **String** | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [optional] [default to String]
**windowStart** | **String** | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified. | [optional] [default to String]
**windowEnd** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. | [optional] [default to String]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. | [optional] [default to List<String>]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**excludeUnsettledTrades** | **Boolean** | Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to Boolean]
**cashFlowType** | **String** | Indicate the requested cash flow representation. Supported string (enumeration) values are: [InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow]. Defaults to &#39;InstrumentCashFlow&#39; (GetCashLadder uses PortfolioCashFlow). Available values: InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow. | [optional] [default to String]
**bucketingSchedule** | [**BucketingSchedule**](BucketingSchedule.md) |  | [optional] [default to BucketingSchedule]
**filter** | **String** |  | [optional] [default to String]
**cashFlowCalculationVersion** | **String** | The version of the cash flow calculation logic to use. Defaults to &#39;1&#39; if not specified. Valid values are &#39;1&#39; and &#39;2&#39;.  &#39;1&#39; is the current production behaviour: cash flows booked as transactions are de-duplicated against the  instrument cash flows by identifier, and movements are treated as factual when they settle on or before the effective date.  &#39;2&#39; resolves cash flows via a deterministic source waterfall (structured result store &gt; transaction &gt; instrument),  classifies cash flows as factual by the transaction trade date (so trades dealt on or before the effective date  that settle afterwards are factual), and applies corporate action date filtering.  The waterfall governs how each cash flow is resolved, not which sources are listed: under the (default)  InstrumentCashFlow representation the response is the de-duplicated instrument and structured result store stream —  a cash flow booked as a transaction is removed from the projection rather than re-listed as a transaction cash flow.  Transaction-sourced cash flows are returned by the PortfolioCashFlow and TransactionCashFlow representations and  by the bucket cash flow drill-down endpoint.  Bucketed responses calculated under version &#39;2&#39; always include the bucket interval metadata columns  (&#39;Valuation/Bucket/Start&#39;, &#39;Valuation/Bucket/End&#39;, &#39;Valuation/Bucket/StartInclusive&#39;, &#39;Valuation/Bucket/EndInclusive&#39;),  which are the required input of the bucket cash flow drill-down endpoint. Without a border configuration the  metadata describes the window-clamped interval of cash flow dates that the rounding method allocates to each bucket point. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BucketedCashFlowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RoundingMethod = "example RoundingMethod";
@jakarta.annotation.Nullable List<OffsetDateTime> BucketingDates = new List<OffsetDateTime>();
@jakarta.annotation.Nullable List<String> BucketTenors = new List<String>();
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable String WindowStart = "example WindowStart";
@jakarta.annotation.Nullable String WindowEnd = "example WindowEnd";
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
@jakarta.annotation.Nullable List<String> Addresses = new List<String>();
Boolean EquipWithSubtotals = true;
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
Boolean ExcludeUnsettledTrades = true;
@jakarta.annotation.Nullable String CashFlowType = "example CashFlowType";
BucketingSchedule BucketingSchedule = new BucketingSchedule();
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable String CashFlowCalculationVersion = "example CashFlowCalculationVersion";


BucketedCashFlowRequest bucketedCashFlowRequestInstance = new BucketedCashFlowRequest()
    .RoundingMethod(RoundingMethod)
    .BucketingDates(BucketingDates)
    .BucketTenors(BucketTenors)
    .EffectiveAt(EffectiveAt)
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .RecipeId(RecipeId)
    .ReportCurrency(ReportCurrency)
    .GroupBy(GroupBy)
    .Addresses(Addresses)
    .EquipWithSubtotals(EquipWithSubtotals)
    .AsAt(AsAt)
    .ExcludeUnsettledTrades(ExcludeUnsettledTrades)
    .CashFlowType(CashFlowType)
    .BucketingSchedule(BucketingSchedule)
    .Filter(Filter)
    .CashFlowCalculationVersion(CashFlowCalculationVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
