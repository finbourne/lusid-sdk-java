# com.finbourne.lusid.model.QueryBucketedCashFlowsRequest
Query for bucketed cashflows from one or more portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**roundingMethod** | **String** | When bucketing, there is not a unique way to allocate the bucket points. Available values: RoundUp, RoundDown. | [default to String]
**bucketingDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty. | [optional] [default to List<OffsetDateTime>]
**bucketingTenors** | **List&lt;String&gt;** | A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty. | [optional] [default to List<String>]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries. | [default to String]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**addresses** | **List&lt;String&gt;** | The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones. | [optional] [default to List<String>]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**excludeUnsettledTrades** | **Boolean** | Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to Boolean]
**cashFlowType** | **String** | Indicate the requested cash flow representation. Supported string (enumeration) values are: [InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow]. Defaults to &#39;InstrumentCashFlow&#39; (GetCashLadder uses PortfolioCashFlow). Available values: InstrumentCashFlow, PortfolioCashFlow, TransactionCashFlow. | [optional] [default to String]
**bucketingSchedule** | [**BucketingSchedule**](BucketingSchedule.md) |  | [optional] [default to BucketingSchedule]
**filter** | **String** |  | [optional] [default to String]
**cashFlowCalculationVersion** | **String** | The version of the cash flow calculation logic to use. Defaults to &#39;1&#39; if not specified. Valid values are &#39;1&#39; and &#39;2&#39;.  &#39;1&#39; is the current production behaviour: cash flows booked as transactions are de-duplicated against the  instrument cash flows by identifier, and movements are treated as factual when they settle on or before the effective date.  &#39;2&#39; resolves cash flows via a deterministic source waterfall (structured result store &gt; transaction &gt; instrument),  classifies cash flows as factual by the transaction trade date (so trades dealt on or before the effective date  that settle afterwards are factual), and applies corporate action date filtering.  Bucketed responses calculated under version &#39;2&#39; always include the bucket interval metadata columns  (&#39;Valuation/Bucket/Start&#39;, &#39;Valuation/Bucket/End&#39;, &#39;Valuation/Bucket/StartInclusive&#39;, &#39;Valuation/Bucket/EndInclusive&#39;),  which are the required input of the bucket cash flow drill-down endpoint. Without a border configuration the  metadata describes the window-clamped interval of cash flow dates that the rounding method allocates to each bucket point. | [optional] [default to String]
**haircutRules** | [**List&lt;CashFlowHaircutRule&gt;**](CashFlowHaircutRule.md) | Optional ordered haircut rules applied to cashflow inflows; the first matching rule wins and a rule with no criteria acts as a catch-all. When supplied, the additional per-bucket columns &#39;Valuation/Bucket/HaircutAmount&#39; and &#39;Valuation/Bucket/NetOfHaircutAmount&#39; are produced; with no rules the results are unchanged. Only supported for the InstrumentCashFlow CashFlowType. | [optional] [default to List<CashFlowHaircutRule>]
**borderConfiguration** | [**BucketBorderConfiguration**](BucketBorderConfiguration.md) |  | [optional] [default to BucketBorderConfiguration]
**startingBalance** | **String** | The balance to use at the start of the bucketing window when computing open/close balances.  Supported string (enumeration) values are: [PortfolioCashBalance, Zero].  When supplied, the additional per-bucket running balance columns &#39;Valuation/Bucket/OpenBalance&#39; and &#39;Valuation/Bucket/CloseBalance&#39; are produced  per group, in the currency of the group&#39;s cash flows: the first bucket opens at zero (&#39;Zero&#39;) or at the portfolio cash balance at the window  start (&#39;PortfolioCashBalance&#39;), and each subsequent bucket opens at the previous bucket&#39;s close balance. When absent, no balance columns are  produced and the results are unchanged. &#39;PortfolioCashBalance&#39; is only supported for the PortfolioCashFlow and TransactionCashFlow CashFlowTypes. Available values: PortfolioCashBalance, Zero. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryBucketedCashFlowsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
ResourceId RecipeId = new ResourceId();
String RoundingMethod = "example RoundingMethod";
@jakarta.annotation.Nullable List<OffsetDateTime> BucketingDates = new List<OffsetDateTime>();
@jakarta.annotation.Nullable List<String> BucketingTenors = new List<String>();
String ReportCurrency = "example ReportCurrency";
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
@jakarta.annotation.Nullable List<String> Addresses = new List<String>();
Boolean EquipWithSubtotals = true;
Boolean ExcludeUnsettledTrades = true;
@jakarta.annotation.Nullable String CashFlowType = "example CashFlowType";
BucketingSchedule BucketingSchedule = new BucketingSchedule();
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable String CashFlowCalculationVersion = "example CashFlowCalculationVersion";
@jakarta.annotation.Nullable List<CashFlowHaircutRule> HaircutRules = new List<CashFlowHaircutRule>();
BucketBorderConfiguration BorderConfiguration = new BucketBorderConfiguration();
@jakarta.annotation.Nullable String StartingBalance = "example StartingBalance";


QueryBucketedCashFlowsRequest queryBucketedCashFlowsRequestInstance = new QueryBucketedCashFlowsRequest()
    .AsAt(AsAt)
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .PortfolioEntityIds(PortfolioEntityIds)
    .EffectiveAt(EffectiveAt)
    .RecipeId(RecipeId)
    .RoundingMethod(RoundingMethod)
    .BucketingDates(BucketingDates)
    .BucketingTenors(BucketingTenors)
    .ReportCurrency(ReportCurrency)
    .GroupBy(GroupBy)
    .Addresses(Addresses)
    .EquipWithSubtotals(EquipWithSubtotals)
    .ExcludeUnsettledTrades(ExcludeUnsettledTrades)
    .CashFlowType(CashFlowType)
    .BucketingSchedule(BucketingSchedule)
    .Filter(Filter)
    .CashFlowCalculationVersion(CashFlowCalculationVersion)
    .HaircutRules(HaircutRules)
    .BorderConfiguration(BorderConfiguration)
    .StartingBalance(StartingBalance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
